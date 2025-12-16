package org.ies.tierno.models;

public class Triangle extends Figure {
    protected double base;
    protected double height;

    public Triangle(String color, double base, double height){
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }
}
