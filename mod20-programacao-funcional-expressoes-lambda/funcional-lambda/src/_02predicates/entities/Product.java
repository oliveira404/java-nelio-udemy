package _02predicates.entities;

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

    // o metodo static trabalha com o produto que voce passar para ele como argumento
    public static boolean staticProductPredicate(Product product) {
        return product.getPreco() >= 100;
    }

    // ele é um metodo que vai trabalhar com o proprio produto onde estou ent tiramos o arqumenmto
    public boolean nonStaticProductPredicate() {
        return this.preco >= 100;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", preco=" + preco +
                '}';
    }
}
