package exercicio_1;

import exercicio_1.entities.Contract;
import exercicio_1.entities.ContractService;
import exercicio_1.entities.PaypalService;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        Integer numero = entrada.nextInt();

        System.out.print("Data: (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(entrada.next(), fmt);

        System.out.print("Valor do contrato: ");
        Double valorDoContrato = entrada.nextDouble();


        Contract contract = new Contract(numero, data, valorDoContrato);

        System.out.print("Entre com o número de parcelas: ");
        Integer numeroDeParcelas = entrada.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, numeroDeParcelas);

        System.out.println("Parcelas:");

        contract.getInstallments().forEach(installment -> {
            System.out.println(installment);
        });

        entrada.close();
    }
}
