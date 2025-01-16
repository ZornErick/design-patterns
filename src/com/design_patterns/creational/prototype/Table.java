package com.design_patterns.creational.prototype;

public abstract class Table {
    public String color;
    public String material;

    public Table() {
    }

    public Table(Table target) {
        if (target != null) {
            this.color = target.color;
            this.material = target.material;
        }
    }

    public abstract Table clone();
}
