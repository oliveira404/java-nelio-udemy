package _08exercicio_resolvido;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        String path = "/home/shark/workspace/back-end/java-nelio-udemy/mod20-programacao-funcional-expressoes-lambda/funcional-lambda/src/_08exercicio_resolvido/produtos.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double precoMedioDeTodosOsProdutos = list.stream()
                    .map(product -> product.getPreco())
                    .reduce(0.0, (x, y) -> x + y) / list.size();
            System.out.println("Average price: " + String.format("%.2f", precoMedioDeTodosOsProdutos));

            // Compara na ordem crescente
            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    // tod0 produto tal que produto
                    .filter(product -> product.getPreco() < precoMedioDeTodosOsProdutos)
                    .map(p -> p.getName())
                    .sorted(comparator.reversed())
                    .toList(); //vai comparar na orde mreversa com reversed.

            names.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
