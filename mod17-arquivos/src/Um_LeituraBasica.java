import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Um_LeituraBasica {
    public static void main(String[] args) {
        Scanner sc = null;

        File file = new File("/home/duke/english");
        //independente se der certo o try ou nao ele vai fechar no finally
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}