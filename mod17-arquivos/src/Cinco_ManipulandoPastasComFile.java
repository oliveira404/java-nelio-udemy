import java.io.File;
import java.util.Scanner;

public class Cinco_ManipulandoPastasComFile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String caminho = entrada.nextLine();

        File path = new File(caminho);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files:");
        for (File file : files) System.out.println(file);

        //criando pasta
        boolean success = new File(caminho + "/java-criando-pasta").mkdir();
        System.out.println("Directory created successfully: " + success);

        entrada.close();
    }
}
