package com.design_patterns.behavioral.visitor;

public class Card extends Equipment {
    public Card(String name) {
        super(name);
    }

    @Override
    public double getNetPrice() {
        return 80.0;
    }

    @Override
    public int getPower() {
        return 10;
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        visitor.visitCard(this);
    }
}
