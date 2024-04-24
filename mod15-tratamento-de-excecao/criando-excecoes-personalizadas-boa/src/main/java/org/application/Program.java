package org.application;

import org.application.model.entities.Reservation;
import org.application.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = entrada.nextInt();

            System.out.print("Check-in: date (dd/MM/yyyy) ");
            Date checkIn = sdf.parse(entrada.next());

            System.out.print("Check-out: date (dd/MM/yyyy) ");
            Date checkOut = sdf.parse(entrada.next());


            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in: date (dd/MM/yyyy) ");
            checkIn = sdf.parse(entrada.next());

            System.out.print("Check-out: date (dd/MM/yyyy) ");
            checkOut = sdf.parse(entrada.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("reservation: " + reservation);

        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());

            //inputTypeException vai casar com a runtime pq as exceções tmb fazem herança
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
        entrada.close();
    }
}