import entities.Shape;
import entities.enums.Circle;
import entities.enums.Color;
import entities.enums.Rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes. ");
        int c = entrada.nextInt();

        for (int i=1; i <= c; i++) {
            System.out.println("Shape " + i + ": ");
            System.out.println("Rectangle or cicle? (r/c)");
            char cha = entrada.next().charAt(0);

            System.out.println("BLACK/BLUE/RED ? ");
            Color color = Color.valueOf(entrada.next());

            if (cha == 'r') {
                System.out.print("width: ");
                double width = entrada.nextDouble();
                System.out.print("height: ");
                double height = entrada.nextDouble();
                list.add(new Rectangle(width, height, color));
            } else {
                System.out.println("Radios: ");
                double radios = entrada.nextInt();
                list.add(new Circle(color, radios));
            }
        }

        System.out.println("\nSHAPE AREAS: ");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        entrada.close();
    }
}