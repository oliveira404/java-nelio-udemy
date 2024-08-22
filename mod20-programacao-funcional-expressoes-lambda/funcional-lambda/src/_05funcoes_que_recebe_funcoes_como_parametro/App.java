package _05funcoes_que_recebe_funcoes_como_parametro;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //ProductService productService = new ProductService();
        // Veja que é uma funcao recebendo outra funcao lambda
        double sum = ProductService.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        //double sum = ProductService.filteredSum(list, p -> p.getPrice() < 100.0);
        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
