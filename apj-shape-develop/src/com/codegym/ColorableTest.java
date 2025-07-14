package com.codegym;

public class ColorableTest {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[2];
        shapes[0] = new Rectangle(4.0, 6.0);
        shapes[1] = new Circle(3.0);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());

            if(shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}
