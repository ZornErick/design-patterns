package com.design_patterns.creational.builder;

import com.design_patterns.creational.builder.character.Character;

public interface CharacterBuilder {
    default void buildName() {};
    default void buildClass() {};
    default void buildAttributes() {};
    default void buildEquipment() {};
    Character getCharacter();
}
