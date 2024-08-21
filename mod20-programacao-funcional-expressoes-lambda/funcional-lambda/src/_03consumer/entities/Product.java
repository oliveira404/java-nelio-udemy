package _03consumer.entities;

public class Product {

    private String name;
    private Double preco;

    public Product() {

    }

    public Product(String name, Double preco) {
        this.name = name;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public static void staticPriceUpdate(Product product) {
        product.setPreco(product.getPreco() * 1.1);
    }

    public void nonStaticPriceUpdate() {
        this.preco = this.preco * 1.1;
    }

    @Override
    public String toString() {
        return String.format("nome: %s preco: preco: %.2f", name ,preco);
    }
}
