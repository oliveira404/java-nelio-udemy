package _03consumer;

import _03consumer.entities.Product;
import _03consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Consumer por Implementação de interface
        // list.forEach(new PriceUpdate());

        // Consumer por Reference method com metodo estático
        //list.forEach(Product::staticPriceUpdate);

        // Consumer por Reference method com metodo não estático
        //list.forEach(Product::nonStaticPriceUpdate);

        double valorPorcentagem = 1.1;
        // Consumer por Expressão lambda declarada
        /*Consumer<Product> consumer = product -> {
            product.setPreco(product.getPreco() * valorPorcentagem);
        };
        list.forEach(consumer);*/

        // Consumer por Expressão lambda inline
        list.forEach(product -> product.setPreco(product.getPreco() * valorPorcentagem));
        list.forEach(System.out::println);
    }
}
