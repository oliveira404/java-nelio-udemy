package _04function;

import _04function.entities.Product;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Implementação da interface
        // a funcao map aplica essa funcao a cada elemento da stream
        //List<String> names = list.stream().map(new UpercaseName()).collect(Collectors.toList());

        // Reference method com metodo estático
        //List<String> names = list.stream().map(Product::staticUppercaseName).toList();

        // Reference method com metodo não estático
        //List<String> names = list.stream().map(Product::nonStaticUppercaseName).toList();

        // Expressão lambda declarada
        // nossa function recebe um product como entrada e como saida responde com um string
        //Function<Product, String> function = product -> product.getName().toUpperCase();
        //List<String> names = list.stream().map(function).toList();

        // Expressão lambda inline
        // nossa function recebe um product como entrada e como saida responde com um string
        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).toList();

        names.forEach(System.out::println);
    }
}
