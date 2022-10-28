package com.company.javaRelearn.GeneratorTest_2022_10_2;

public class SumNumbers implements GeneratorTest<Integer> {
    private int n;
    public SumNumbers() {

    }
    public SumNumbers(int n) {
        super();
        this.n = n;
    }

    @Override
    public Integer calculate() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
