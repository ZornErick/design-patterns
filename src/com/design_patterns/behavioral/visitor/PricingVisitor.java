package com.design_patterns.behavioral.visitor;

public class PricingVisitor implements EquipmentVisitor {
    private double total;

    public double getTotal() {
        return total;
    }

    @Override
    public void visitFloppyDisk(FloppyDisk floppyDisk) {
        total += floppyDisk.getNetPrice();
    }

    @Override
    public void visitCard(Card card) {
        total += card.getNetPrice();
    }

    @Override
    public void visitChassis(Chassis chassis) {
        total += 200.0;
    }
}
