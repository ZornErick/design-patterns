package com.design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class TableCache {
    private Map<String, Table> cache = new HashMap<>();

    public TableCache() {
        RectangularTable rectangularTable = new RectangularTable();
        rectangularTable.color = "brown";
        rectangularTable.material = "wood";
        rectangularTable.width = 50;
        rectangularTable.height = 100;

        RoundTable roundTable = new RoundTable();
        roundTable.color = "transparent";
        roundTable.material = "glass";
        roundTable.radius = 25;

        cache.put("Rectangular Wood Table", rectangularTable);
        cache.put("Round Glass Table", roundTable);
    }

    public Table get(String key) {
        return cache.get(key).clone();
    }

    public Table put(String key, Table table) {
        cache.put(key, table);
        return table;
    }

    public void remove(String key) {
        cache.remove(key);
    }
}
