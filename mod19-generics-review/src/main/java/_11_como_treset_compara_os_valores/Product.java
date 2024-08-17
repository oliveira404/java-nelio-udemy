package _11_como_treset_compara_os_valores;

import java.util.Objects;

public class Product implements Comparable<Product>{

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    // (... get / set / hashCode / equals)
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }
}
