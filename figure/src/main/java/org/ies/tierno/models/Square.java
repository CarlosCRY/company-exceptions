package org.ies.tierno.models;

public class Square extends Figure {
    protected double side;

    public Square(String color, double side){
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
