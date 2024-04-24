package entities.enums;

import entities.Shape;

public class Rectangle extends Shape {

    private double width;
    private double height;



    @Override
    public double area() {
        return width * height;
    }


    public Rectangle(Double width, Double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
