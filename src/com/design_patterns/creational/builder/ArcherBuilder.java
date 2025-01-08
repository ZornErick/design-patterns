package com.design_patterns.creational.builder;

import com.design_patterns.creational.builder.character.Character;
import com.design_patterns.creational.builder.character.CharacterAttributes;
import com.design_patterns.creational.builder.character.CharacterClass;
import com.design_patterns.creational.builder.character.CharacterEquipment;

public class ArcherBuilder implements CharacterBuilder {
    private final Character character;

    public ArcherBuilder() {
        this.character = new Character();
    }

    @Override
    public void buildName() {
        character.setName("Archer Paladin");
    }

    @Override
    public void buildClass() {
        character.setCharacterClass(CharacterClass.Archer);
    }

    @Override
    public void buildAttributes() {
        character.setCharacterAttributes(new CharacterAttributes(80, 80, 60));
    }

    @Override
    public void buildEquipment() {
        character.setCharacterEquipment(new CharacterEquipment("Bow", "Fire Cape", "Arrows"));
    }

    @Override
    public Character getCharacter() {
        return this.character;
    }
}
