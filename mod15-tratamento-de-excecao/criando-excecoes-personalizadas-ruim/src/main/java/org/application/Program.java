package org.application;

import org.application.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = entrada.nextInt();

        System.out.print("Check-in: date (dd/MM/yyyy) ");
        Date checkIn = sdf.parse(entrada.next());

        System.out.print("Check-out: date (dd/MM/yyyy) ");
        Date checkOut = sdf.parse(entrada.next());

        if(!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("reservation: " + reservation);

            System.out.println();
            System.out.print("Check-in: date (dd/MM/yyyy) ");
            checkIn = sdf.parse(entrada.next());

            System.out.print("Check-out: date (dd/MM/yyyy) ");
            checkOut = sdf.parse(entrada.next());

            String error = reservation.updateDates(checkIn, checkOut);
            if (error != null) System.out.println("Error in reservation: " + error);
            System.out.println("reservation: " + reservation);
        }

        entrada.close();
    }
}