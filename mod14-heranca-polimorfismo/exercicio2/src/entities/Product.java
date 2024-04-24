package entities;

public class Product {
    private String name;
    private Double prince;

    public String princeTag() {
        return  this.prince.toString();
    }
}
