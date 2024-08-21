package _04function.entities;

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

    public static String staticUppercaseName(Product product) {
        return product.getName().toUpperCase();
    }

    public String nonStaticUppercaseName() {
        return this.name.toUpperCase();
    }

}
