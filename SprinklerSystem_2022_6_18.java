package com.company.javaRelearn;

class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return "WaterSource{" +
                "s='" + s + '\'' +
                '}';
    }
}

public class SprinklerSystem_2022_6_18 {
    private String value1, value2, value3, value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem_2022_6_18{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                ", value4='" + value4 + '\'' +
                ", source=" + source +
                ", i=" + i +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        SprinklerSystem_2022_6_18 sprinklers = new SprinklerSystem_2022_6_18();
        System.out.println(sprinklers);

    }
}
