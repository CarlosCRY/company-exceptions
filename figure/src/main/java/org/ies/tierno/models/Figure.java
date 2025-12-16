package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Figure {
    protected String color;

    protected abstract double area ();

    public final void showInfo () {
        System.out.print("\nColor: " + color + ", Area: " + area());
    }

}
