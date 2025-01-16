package com.design_patterns.creational.prototype;

public class RoundTable extends Table {
    public int radius;

    public RoundTable() {
    }

    public RoundTable(RoundTable target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Table clone() {
        return new RoundTable(this);
    }

    @Override
    public String toString() {
        return "RoundTable{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
