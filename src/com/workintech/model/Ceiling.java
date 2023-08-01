package com.workintech.model;

import com.workintech.enums.PaintColor;

public class Ceiling {
    private double height;
    private PaintColor color;

    public Ceiling(double height, PaintColor color) {
        this.height = height;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void create() {
        System.out.println("Ceiling with " + height + " and color with " + color + " has been created");
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "height=" + height +
                ", color=" + color +
                '}';
    }
}
