package com.design_patterns.behavioral.visitor;

import java.util.HashMap;
import java.util.Map;

public class InventoryVisitor implements EquipmentVisitor {
    private Map<String, Integer> counts = new HashMap<>();

    public Map<String, Integer> getCounts() {
        return counts;
    }

    private void register(Equipment equipment) {
        counts.merge(equipment.getName(), 1, Integer::sum);
    }

    @Override
    public void visitFloppyDisk(FloppyDisk floppyDisk) {
        register(floppyDisk);
    }

    @Override
    public void visitCard(Card card) {
        register(card);
    }

    @Override
    public void visitChassis(Chassis chassis) {
        register(chassis);
    }
}
