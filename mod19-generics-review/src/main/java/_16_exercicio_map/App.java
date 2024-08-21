package _16_exercicio_map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ///System.out.print("Enter file full path: ");
        //String path = entrada.nextLine();

        System.out.println("Automatic Path!");
        String path = "/home/shark/workspace/back-end/java-nelio-udemy/mod19-generics-review/src/main/java/_16_exercicio_map/votos.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Integer> votos = new LinkedHashMap<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Integer countVotes = Integer.parseInt(fields[1]);

                if (votos.containsKey(name)) {
                    int votesSoFar = votos.get(name);
                    votos.put(name, countVotes + votesSoFar);
                } else {
                    votos.put(name, countVotes);
                }
                line = br.readLine();
            }
            for (String key : votos.keySet()) {
                System.out.println(key + ": " + votos.get(key));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        entrada.close();
    }
}
///home/shark/workspace/back-end/java-nelio-udemy/mod19-generics-review/src/main/java/_16_exercicio_map