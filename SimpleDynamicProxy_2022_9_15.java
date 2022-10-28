package com.company.javaRelearn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args:" + args);
        if (args != null) {
            for (Object arg : args)
                System.out.println("  " + arg);
        }
        return method.invoke(proxied, args);
    }
}

public class SimpleDynamicProxy_2022_9_15 {
    public static void customer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        customer(real);
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
                new Class[] {Interface.class},
                new DynamicProxyHandler(real));
        customer(proxy);
    }
}
