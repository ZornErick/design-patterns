package com.design_patterns.creational.builder.character;

public class Character {
    private String name;
    private CharacterClass characterClass;
    private CharacterAttributes characterAttributes;
    private CharacterEquipment characterEquipment;

    public void setName(String name) {
        this.name = name;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public void setCharacterAttributes(CharacterAttributes characterAttributes) {
        this.characterAttributes = characterAttributes;
    }

    public void setCharacterEquipment(CharacterEquipment characterEquipment) {
        this.characterEquipment = characterEquipment;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", characterClass=" + characterClass +
                ", characterAttributes=" + characterAttributes +
                ", characterEquipment=" + characterEquipment +
                '}';
    }
}
