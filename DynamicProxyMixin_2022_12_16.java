package com.company.javaRelearn;

import com.company.javaRelearn.Tuple_2022_9_20.TwoTuple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

class MixinProxy implements InvocationHandler {
    Map<String,Object> delegatesByMethod;
    public MixinProxy(TwoTuple<Object,Class<?>>... pairs) {
        delegatesByMethod = new HashMap<String, Object>();
        for (TwoTuple<Object,Class<?>> pair : pairs) {
            for (Method method : pair.second.getMethods()) {
                String methodName = method.getName();
                //Map中的第一个接口实现了该方法。
                if (!delegatesByMethod.containsKey(methodName)) {
                    delegatesByMethod.put(methodName,pair.first);
                }
            }
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Object delegate = delegatesByMethod.get(methodName);
        return method.invoke(delegate,args);
    }

    @SuppressWarnings("unchecked")
    public static Object newInstance(TwoTuple... pairs) {
        Class[] interfaces = new Class[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            interfaces[i] = (Class)pairs[i].second;
        }
        ClassLoader c1 = pairs[0].first.getClass().getClassLoader();
        return Proxy.newProxyInstance(c1,interfaces,new MixinProxy(pairs));
    }
}

public class DynamicProxyMixin_2022_12_16 {
    public static void main(String[] args) {
        Object mixin = MixinProxy.newInstance(
                new TwoTuple(new BasicImp(), Basic1.class),
                new TwoTuple(new TimeStampedImp(),TimeStamped1.class),
                new TwoTuple(new SerialNumberedImp(),SerialNumbered.class));
        Basic1 b = (Basic1) mixin;
        TimeStamped1 t = (TimeStamped1) mixin;
        SerialNumbered1 s = (SerialNumbered1) mixin;
        b.set("Hello");
        System.out.println(b.get());
        System.out.println(t.getStamp());
        System.out.println(s.getSerialNumber());
    }
}
