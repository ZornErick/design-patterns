package com.design_patterns.behavioral.visitor;

public interface EquipmentVisitor {
    void visitFloppyDisk(FloppyDisk floppyDisk);

    void visitCard(Card card);

    void visitChassis(Chassis chassis);
}
