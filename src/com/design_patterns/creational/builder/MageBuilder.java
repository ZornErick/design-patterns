package com.design_patterns.creational.builder;

import com.design_patterns.creational.builder.character.Character;
import com.design_patterns.creational.builder.character.CharacterAttributes;
import com.design_patterns.creational.builder.character.CharacterClass;
import com.design_patterns.creational.builder.character.CharacterEquipment;

public class MageBuilder implements CharacterBuilder {
    private final Character character;

    public MageBuilder() {
        this.character = new Character();
    }

    @Override
    public void buildName() {
        character.setName("Mage Druid");
    }

    @Override
    public void buildClass() {
        character.setCharacterClass(CharacterClass.Mage);
    }

    @Override
    public void buildAttributes() {
        character.setCharacterAttributes(new CharacterAttributes(50, 110, 40));
    }

    @Override
    public void buildEquipment() {
        character.setCharacterEquipment(new CharacterEquipment("Magic Wand", "Glacier Robe", "Glacier Amulet"));
    }

    @Override
    public Character getCharacter() {
        return this.character;
    }
}
