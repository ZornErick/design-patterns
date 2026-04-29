package com.design_patterns.behavioral.visitor;

public abstract class Equipment {
    private String name;

    public Equipment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getNetPrice();

    public abstract int getPower();

    public abstract void accept(EquipmentVisitor visitor);
}
