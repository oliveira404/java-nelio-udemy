import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o número de produtos: ");
        int numeroProdutos = entrada.nextInt();

    }
}

/*
* System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(entrada.next());
* */