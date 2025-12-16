package org.ies.tierno.models;

import static java.lang.Math.PI;

public class Circle extends Figure {
    protected double radio;

    public Circle (String color, double radio){
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
        return PI * radio * radio;
    }
}
