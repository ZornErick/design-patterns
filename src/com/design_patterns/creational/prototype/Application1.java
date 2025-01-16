package com.design_patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        RectangularTable rectangularTable = new RectangularTable();
        rectangularTable.color = "brown";
        rectangularTable.material = "wood";
        rectangularTable.width = 50;
        rectangularTable.height = 100;

        RoundTable roundTable = new RoundTable();
        roundTable.color = "transparent";
        roundTable.material = "glass";
        roundTable.radius = 25;

        Table anotherTable1 = rectangularTable.clone();
        Table anotherTable2 = roundTable.clone();

        System.out.println(anotherTable1);
        System.out.println(anotherTable2);
    }
}
