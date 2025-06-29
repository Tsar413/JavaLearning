package com.company.javaRelearn.AdvancedProgrammingLab.Lab3;

public class CompositeDeliveryDriver {
    public static void displayDelivery(ShopComponent c) {
        System.out.println(c + " costs " + c.compDelivery() + " to deliver.");
    }

    public static void main(String[] args) {

        ShopLeaf ipad = new ShopLeaf(600.0,true,"iPad Air");
        ShopLeaf laptop = new ShopLeaf(850.0,true,"MacBook");
        ShopLeaf powerAdaptor = new ShopLeaf(50.0,false,"Power Adaptor");
        ShopLeaf keyboard = new ShopLeaf(125.0,false,"Magic Keyboard");
        ShopLeaf trackpad = new ShopLeaf(115.0,false,"Magic Trackpad");
        displayDelivery(ipad);
        displayDelivery(laptop);
        displayDelivery(powerAdaptor);
        displayDelivery(keyboard);
        displayDelivery(trackpad);

        ShopComposite accessoryPack = new ShopComposite("Mac accessory pack");
        accessoryPack.add(powerAdaptor);
        accessoryPack.add(keyboard);
        accessoryPack.add(trackpad);
        displayDelivery(accessoryPack);

        ShopComposite laptopPack = new ShopComposite("MacBook pack");
        laptopPack.add(laptop);
        laptopPack.add(powerAdaptor);
        laptopPack.add(keyboard);
        laptopPack.add(trackpad);
        displayDelivery(laptopPack);
    }
}
