package org.ies.tierno;

import org.ies.tierno.models.Square;
import org.ies.tierno.models.Circle;
import org.ies.tierno.models.Triangle;

public class Main {
    public static void main(String[] args) {
        Square square = new Square ("Red", 7);
        Circle circle = new Circle ("Golden", 8);
        Triangle triangle = new Triangle ("Purple", 4, 3);

        square.showInfo();

        circle.showInfo();

        triangle.showInfo();
    }
}