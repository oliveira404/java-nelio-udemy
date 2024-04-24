package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(){

    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
/*
    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
*/

    public Double subTotal(){
        return quantity * this.price;
    }




    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        return sb.append("\n"+product.getName()+", "+String.format("$%.2f",product.getPrice())
                +", Quantity: " + this.quantity + ", Subtotal: "
                +String.format("$%.2f",subTotal())).toString();
    }
}
