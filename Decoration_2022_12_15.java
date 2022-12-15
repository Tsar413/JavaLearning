package com.company.javaRelearn;

import java.util.Date;

class Basic1 {
    private String value;
    public String get() {
        return value;
    }
    public void set(String value) {
        this.value = value;
    }
}

class Decorator extends Basic1 {
    protected Basic1 basic;
    public Decorator(Basic1 basic) {
        this.basic = basic;
    }
    public void set(String val) {
        basic.set(val);
    }
}

class TimeStamped1 extends Decorator {
    private final long timeStamp;

    public TimeStamped1(Basic1 basic) {
        super(basic);
        timeStamp = new Date().getTime();
    }

    public long getStamp() {
        return timeStamp;
    }
}

class SerialNumbered1 extends Decorator {
    private static long counter = 1;
    private final long serialNumber = counter++;
    public SerialNumbered1(Basic1 basic) {
        super(basic);
    }

    public long getSerialNumber() {
        return serialNumber;
    }
}

public class Decoration_2022_12_15 {
    public static void main(String[] args) {
        TimeStamped1 t = new TimeStamped1(new Basic1());
        TimeStamped1 t2 = new TimeStamped1(
                new SerialNumbered1(new Basic1()));
        SerialNumbered1 s = new SerialNumbered1(new Basic1());
        SerialNumbered1 s2 = new SerialNumbered1(
                new TimeStamped1(new Basic1()));
    }
}
