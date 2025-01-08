package com.design_patterns.creational.builder;

public class Director {
    private final CharacterBuilder builder;

    public Director(CharacterBuilder builder) {
        this.builder = builder;
    }

    public void constructCharacter() {
        builder.buildName();
        builder.buildClass();
        builder.buildAttributes();
        builder.buildEquipment();
    }
}
