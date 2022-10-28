package com.company.javaRelearn;

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'c';
    }
    float doh(float f) {
        System.out.println("doh(float)");
        return 'f';
    }
}

class Milhouse {

}

class Bart extends Homer {
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
}

public class NameMasking_2022_6_20 {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh('a');
        b.doh(1);
        b.doh(1.0f);
        b.doh(new Milhouse());
    }
}
