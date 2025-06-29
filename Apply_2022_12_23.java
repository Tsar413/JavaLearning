package com.company.javaRelearn;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Apply_2022_12_23 {
    public static <T, S extends Iterable<? extends T>>
            void apply(S seq, Method f, Object... args) {
        try {
            for (T t: seq) {
                f.invoke(t,args);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Shape1 {
    public void rotate() {
        System.out.println(this + " rotate");
    }
    public void resize(int newSize) {
        System.out.println(this + " resize " + newSize);
    }
}

class Square extends Shape1 {}

class FilledList<T> extends ArrayList<T> {
    public FilledList(Class<? extends T> type, int size) {
        try {
            for (int i = 0; i < size; i++) {
                add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class ApplyTest {
    public static void main(String[] args) throws Exception {
        List<Shape1> shapes = new ArrayList<Shape1>();
        for (int i = 0; i < 10; i++) {
            shapes.add(new Shape1());
        }
        Apply_2022_12_23.apply(shapes, Shape1.class.getMethod("rotate"));
        Apply_2022_12_23.apply(shapes,Shape1.class.getMethod("resize", int.class),5);
        List<Square> squares = new ArrayList<Square>();
        for (int i = 0; i < 10; i++) {
            squares.add(new Square());
        }
        Apply_2022_12_23.apply(squares, Shape1.class.getMethod("rotate"));
        Apply_2022_12_23.apply(squares,Shape1.class.getMethod("resize", int.class),5);

        Apply_2022_12_23.apply(new FilledList<Shape1>(Shape1.class,10),Shape1.class.getMethod("rotate"));
        Apply_2022_12_23.apply(new FilledList<Shape1>(Square.class,10),Shape1.class.getMethod("rotate"));
    }
}
