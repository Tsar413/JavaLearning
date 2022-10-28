package com.company.javaRelearn;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph() {
        System.out.println("Glyph before draw");
        draw();
        System.out.println("Glyph after draw");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    void draw() {
        System.out.println("RoundGlyph.draw " + radius);
    }
    RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph.radius " + radius);
    }
}

public class PloyConstructor_2022_6_27 {
    public static void main(String[] args) {
        Glyph roundGlyph = new RoundGlyph(5);
    }
}
