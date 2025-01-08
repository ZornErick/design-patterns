package com.design_patterns.creational.builder;

import com.design_patterns.creational.builder.character.Character;
import com.design_patterns.creational.builder.character.CharacterAttributes;
import com.design_patterns.creational.builder.character.CharacterClass;
import com.design_patterns.creational.builder.character.CharacterEquipment;

public class WarriorBuilder implements CharacterBuilder {
    private final Character character;

    public WarriorBuilder() {
        this.character = new Character();
    }

    @Override
    public void buildName() {
        character.setName("Warrior Knight");
    }

    @Override
    public void buildClass() {
        character.setCharacterClass(CharacterClass.Warrior);
    }

    @Override
    public void buildAttributes() {
        character.setCharacterAttributes(new CharacterAttributes(90, 70, 50));
    }

    @Override
    public void buildEquipment() {
        character.setCharacterEquipment(new CharacterEquipment("Long Sword", "Plate Armor", "Shield"));
    }

    @Override
    public Character getCharacter() {
        return this.character;
    }
}
