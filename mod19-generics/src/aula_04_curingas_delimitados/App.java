package aula_04_curingas_delimitados;

import aula_04_curingas_delimitados.entities.Circle;
import aula_04_curingas_delimitados.entities.Rectangle;
import aula_04_curingas_delimitados.entities.Shape;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));
    }

    //essa lista nos argumentos, ela pode ser de shape ou de qualquer tipo que seja um sub tipo de shape
    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
