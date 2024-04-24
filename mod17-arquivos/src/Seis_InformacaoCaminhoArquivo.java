import java.io.File;
import java.util.Scanner;

public class Seis_InformacaoCaminhoArquivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = entrada.nextLine();

        File path = new File(strPath);

        //pega o nome do arquivo ou a pasta somente
        System.out.println("getName " + path.getName());

        //ignora onde tá atualmente e pega o caminho dos pais até ele.
        System.out.println("getParents " + path.getParent());

        //caminho absoluto
        System.out.println("getParents " + path.getPath());

        entrada.close();
    }
}
