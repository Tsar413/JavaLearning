package com.company.javaRelearn.SEReview;

public class LabelledPoint extends Point {
    private String label;

    public LabelledPoint() {}

    public LabelledPoint(int x, int y, String label) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "LabelledPoint{" +
                "label='" + label + '\'' +
                '}';
    }
}
