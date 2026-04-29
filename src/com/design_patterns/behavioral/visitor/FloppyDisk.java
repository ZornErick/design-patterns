package com.design_patterns.behavioral.visitor;

public class FloppyDisk extends Equipment {
    public FloppyDisk(String name) {
        super(name);
    }

    @Override
    public double getNetPrice() {
        return 30.0;
    }

    @Override
    public int getPower() {
        return 5;
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        visitor.visitFloppyDisk(this);
    }
}
