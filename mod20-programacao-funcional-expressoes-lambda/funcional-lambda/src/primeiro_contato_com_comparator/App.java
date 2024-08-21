package primeiro_contato_com_comparator;

import primeiro_contato_com_comparator.entities.MyComparator;
import primeiro_contato_com_comparator.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Carreta", 900.00));
        list.add(new Product("Bauducu", 1200.00));
        list.add(new Product("Apple", 450.00));

        // Tem que implementar um comparable na class da Lista para funcionar
        //Collections.sort(list);

        // Usando com comparator classe separada.
        //list.sort(new MyComparator());

        // Isso se chama class anonima
        /*Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };*/

        // Usando a expressao lambda             //levando a uma implementacao
        /*Comparator<Product> comparator = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };*/

        // Usando a expressao lambda mais ainda
        //Comparator<Product> comparator = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        // Usando a expressao lambda mais ainda super blast
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
