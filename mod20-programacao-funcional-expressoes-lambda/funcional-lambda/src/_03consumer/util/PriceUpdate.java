package _03consumer.util;

import _03consumer.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        // 10%
        product.setPreco(product.getPreco() * 1.1);
    }
}
