package com.design_patterns.creational.builder;

import com.design_patterns.creational.builder.character.Character;

public class Application {
    public static void main(String[] args) {
        CharacterBuilder warriorBuilder = new WarriorBuilder();

        Director director = new Director(warriorBuilder);
        director.constructCharacter();

        Character warrior = warriorBuilder.getCharacter();
        System.out.println(warrior);

        CharacterBuilder mageBuilder = new MageBuilder();

        director = new Director(mageBuilder);
        director.constructCharacter();

        Character mage = mageBuilder.getCharacter();
        System.out.println(mage);

        CharacterBuilder archerBuilder = new ArcherBuilder();

        director = new Director(archerBuilder);
        director.constructCharacter();

        Character archer = archerBuilder.getCharacter();
        System.out.println(archer);
    }
}
