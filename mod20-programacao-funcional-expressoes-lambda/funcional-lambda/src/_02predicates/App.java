package _02predicates;

import _02predicates.entities.Product;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Predicate por Implementação da interface
        //list.removeIf(new ProductPredicate());

        // Predicate por Reference method com metodo estático
        /*class onde ele tá e depois o metodo*/
        //list.removeIf(Product::staticProductPredicate);

        // Predicate por Reference method com metodo não estático
        //list.removeIf(Product::nonStaticProductPredicate);

        Double valorPassadoPeloUsuario = 100.0;

        // Predicate por Expressão lambda declarada
        // Ela é boa para pegar valores de variaveis
        /*Predicate<Product> predicate = p -> p.getPreco() >= valorPassadoPeloUsuario;
        list.removeIf(predicate);*/

        // Predicate por Expressão lambda inline
        list.removeIf(product -> product.getPreco() >= valorPassadoPeloUsuario);

        list.forEach(System.out::println);
    }
}