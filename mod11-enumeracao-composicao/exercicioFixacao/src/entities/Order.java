package entities;

import enuns.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
   private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private List<OrderItem> items = new ArrayList<>();

    private Client client;

    public Order(){

    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        Double total = 0.0;

        /*for(int i = 0; i < this.items.size(); i++){
            //total += items.get(i).getPrice() * items.get(i).getQuantity();
        }*/
        for(OrderItem t : items){
            total = total + t.subTotal();
        }

        return total;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    /*@Override
    public String toString() {
        return items.toString();
    }*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("ORDER SUMMARY:");
        sb.append("\nOrder moment: " + sdf2.format(moment));
        sb.append("\nOrder status: " + status);

        sb.append("\n\nClient: " + client);

        sb.append("\nOrder items:");
        for(OrderItem orderItem : items){
            sb.append(orderItem);
        }

        //sb.append(items);

        sb.append("\nTotal price: " + String.format("$%.2f", total()));

        return sb.toString();
    }

    /*
    *         System.out.println("Order Summary:");
        System.out.println("Order moment: " + sdf2.format(order.getMoment()));
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + order.getClient());

        System.out.println("Order items: ");
        System.out.println(order.total());
    *
    * */
}
