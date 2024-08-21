package _04function.util;

import _04function.entities.Product;

import java.util.function.Function;

// nossa function receve um product como entrada e como saida responde com um string
public class UpercaseName implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
