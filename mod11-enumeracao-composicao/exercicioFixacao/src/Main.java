import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enuns.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String name, email, nameProduct;
        Date date;
        String escolhaString;
        double priceProduct;
        int escolhaNumerica, quantityItem, quantityProduct;
        OrderStatus[] enumStatus = OrderStatus.values();
        OrderStatus orderStatusEscolhida = null;



        System.out.print("Enter cliente data: " + "\n");
        System.out.print("Name: " );
        name = input.nextLine();

        System.out.print("E-mail: " );
        email = input.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        date = sdf.parse(input.next());

        System.out.println("\nChoise order status: ");
        for(int i = 0; i < enumStatus.length; i++){
            System.out.println("\t" + "["+i+"] "+enumStatus[i]);
        }

        System.out.print("\nWrite: ");
        escolhaNumerica = input.nextInt();
        input.nextLine();

        for(int i = 0; i < enumStatus.length; i++){
            if(escolhaNumerica == enumStatus[i].ordinal()){
                System.out.println("Your choise status was: " + enumStatus[i]);
                orderStatusEscolhida = enumStatus[i];
            }
        }

        System.out.print("How many items to this order? ");
        quantityItem = input.nextInt();
        input.nextLine();

        //System.out.println("");

        Client client = new Client(name, email, date);
        Order order = new Order(new Date(), orderStatusEscolhida, client);
        OrderItem orderItem = null;


        for(int i = 1; i <= quantityItem; i++){
            System.out.println("\nEnter #"+i+" item data.");
            System.out.print("Product name: ");
            nameProduct = input.nextLine();

            System.out.print("Product price: ");
            priceProduct = input.nextDouble();
            input.nextLine();

            System.out.print("Quantity: ");
            quantityProduct = input.nextInt();
            input.nextLine();


            order.addItem(orderItem = new OrderItem(quantityProduct, priceProduct, new Product(nameProduct, priceProduct)));
        }

        /*System.out.println("Order Summary:");
        System.out.println("Order moment: " + sdf2.format(order.getMoment()));
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + order.getClient());

        System.out.println("Order items: ");
        System.out.println(order.total());
        System.out.println(orderItem);*/

        System.out.println(order);

        input.close();
    }
}