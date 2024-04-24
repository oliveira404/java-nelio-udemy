package revisao_geral_sobre_interfaces;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Integer installmentNumber;
        Integer numero;
        Date date;
        Double contractValue;
        String dateFormat;

        System.out.print("Entre os dados do contrato: ");
        System.out.print("Número: ");
        numero = input.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        dateFormat = input.next();

        System.out.print("Valor do contrato: ");
        contractValue = input.nextDouble();

        System.out.print("Entre com o número de parcelas: ");
        installmentNumber = input.nextInt();


        input.close();
    }
}
