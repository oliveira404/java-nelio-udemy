import entities.Order;
import entity.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        //Veja que o enum vem em String porque esse é o padrão.
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        //Convertendo Enum em String.
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);



    }
}