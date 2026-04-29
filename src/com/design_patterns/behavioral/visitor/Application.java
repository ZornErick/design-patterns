package com.design_patterns.behavioral.visitor;

public class Application {
    public static void main(String[] args) {
        Chassis chassis = new Chassis("PC Chassis");
        chassis.add(new FloppyDisk("Floppy 3.5"));
        chassis.add(new Card("Sound Card"));
        chassis.add(new Card("Video Card"));

        PricingVisitor pricing = new PricingVisitor();
        chassis.accept(pricing);
        System.out.println("Total price: " + pricing.getTotal());

        InventoryVisitor inventory = new InventoryVisitor();
        chassis.accept(inventory);
        System.out.println("Inventory: " + inventory.getCounts());
    }
}
