import java.io.*;
import java.util.Scanner;

public class Quatro_FileWriterAndBufferedWriter {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char escolhaUsuario;
        boolean modificadorDeEscrita = false;

        String[] lines = new String[] {"Oi Oliver!", "How's it going?", "Fuck you asshole!"};
        String path = "/home/duke/english-java";

        System.out.println("Você deseja unir com o que já tem. Ou recriar todo o arquivo?");
        System.out.print("[tecle (s) para unir ou (n) para recriar]");
        escolhaUsuario = entrada.next().charAt(0);

        if (escolhaUsuario == 's' || escolhaUsuario == 'S') {
            modificadorDeEscrita = true;
        } else {
            modificadorDeEscrita = false;
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, modificadorDeEscrita))) { //esse true ele nao vai recriar e sim juntar
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
