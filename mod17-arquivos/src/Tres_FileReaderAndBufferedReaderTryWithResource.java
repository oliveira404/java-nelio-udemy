import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tres_FileReaderAndBufferedReaderTryWithResource {
    public static void main(String[] args) {

        String path = "/home/duke/english";

        //usando o try com recursos
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            //Nao precisa do codigo abaixo mais, pq usavamos somente para pegar ela e fechar
            //porem isso nao é mais necessario já que o try com recursos já faz isso.
            //fileReader = new FileReader(path);
            //bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());

        }
    }
}
