package _02predicates.util;

import _02predicates.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPreco() >= 100.0;
    }
}
