package _04coringas_delimitados;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        List<Rectangle> meusRetangulos = new ArrayList<>();
        meusRetangulos.add(new Rectangle(10.0, 10.0));
        meusRetangulos.add(new Rectangle(12.0, 20.0));

        System.out.println("Total area: " + totalArea(meusRetangulos));
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}