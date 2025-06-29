package com.company.javaRelearn.AdvancedProgrammingLab.Lab3;

public class ShopLeaf implements ShopComponent {
    private Double price;
    private Boolean judge;
    private String tradeName;

    public ShopLeaf() {}

    public ShopLeaf(Double price, Boolean judge, String tradeName) {
        this.price = price;
        this.judge = judge;
        this.tradeName = tradeName;
    }

    @Override
    public Double compPrice(Double discount) {
        return price *= discount;
    }

    @Override
    public Double compDelivery() {
        if (this.judge == true) {
            return price * 0.05;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return tradeName;
    }
}
