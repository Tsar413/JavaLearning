package com.company.javaRelearn.AdvancedProgrammingLab.Lab3;

import java.util.ArrayList;
import java.util.List;

public class ShopComposite implements ShopComponent {
    private String shopName;
    private List<ShopComponent> list;
    private double cost;

    public ShopComposite() {}

    public ShopComposite(String shopName) {
        this.shopName = shopName;
        list = new ArrayList<ShopComponent>();
    }

    public void add(ShopComponent shopComponent) {
        list.add(shopComponent);
    }

    @Override
    public Double compPrice(Double discount) {
        return null;
    }

    @Override
    public Double compDelivery() {
        for (ShopComponent s : list) {
            cost += s.compDelivery();
        }
        return cost;
    }

    @Override
    public String toString() {
        return shopName + " pack " + list.toString() + " collection";
    }
}
