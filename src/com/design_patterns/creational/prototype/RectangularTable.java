package com.design_patterns.creational.prototype;

public class RectangularTable extends Table {
    public int width;
    public int height;

    public RectangularTable() {
    }

    public RectangularTable(RectangularTable target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Table clone() {
        return new RectangularTable(this);
    }

    @Override
    public String toString() {
        return "RectangularTable{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
