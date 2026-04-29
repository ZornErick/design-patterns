package com.design_patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Chassis extends Equipment {
    private List<Equipment> parts = new ArrayList<>();

    public Chassis(String name) {
        super(name);
    }

    public void add(Equipment equipment) {
        parts.add(equipment);
    }

    public List<Equipment> getParts() {
        return parts;
    }

    @Override
    public double getNetPrice() {
        double total = 200.0;
        for (Equipment part : parts) {
            total += part.getNetPrice();
        }
        return total;
    }

    @Override
    public int getPower() {
        int total = 30;
        for (Equipment part : parts) {
            total += part.getPower();
        }
        return total;
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        for (Equipment part : parts) {
            part.accept(visitor);
        }
        visitor.visitChassis(this);
    }
}
