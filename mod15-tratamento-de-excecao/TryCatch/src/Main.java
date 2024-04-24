import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        metho1();

        System.out.println("end code");

    }

    public static void metho1() {
        System.out.println("Método 1 start");
        metho2();
        System.out.println("Método 1 end");
    }

    public static void metho2() {
        System.out.println("Método 2 start");
        Scanner entrada = new Scanner(System.in);

        //try {
            String[] vect = entrada.nextLine().split(" ");
            int position = entrada.nextInt();
            System.out.println(vect[position]);
        /*} catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("posicao invalida");
            e.printStackTrace();
            entrada.next();
        } catch (InputMismatchException e){
            System.out.println("input error");
        }*/

        entrada.close();
        System.out.println("Método 2 end");
    }
}