package _02genericos_delimitados;

import _02genericos_delimitados.entity.Product;
import _02genericos_delimitados.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        String path = "/home/shark/workspaces/java-nelio-udemy/mod19-generics-review/src/main/java/_02genericos_delimitados/arquivo.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
