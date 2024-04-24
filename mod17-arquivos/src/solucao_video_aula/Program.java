package solucao_video_aula;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter file path: ");
        String sourcePathStr = input.nextLine();

        File sourceFile = new File(sourcePathStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "/out-gerado").mkdir();

        String targetFileStr = sourceFolderStr + "/out-gerado/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {

            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f",item.total()));
                    bw.newLine();
                }
                System.out.println(targetFileStr + " CREATED!");
            } catch (IOException e) {
                e.printStackTrace();
            }
///home/duke/workspaces/back-end/java-nelio/mod17-arquivos/src/solucao_video_aula/asas.csv
        } catch (IOException e) {
            e.printStackTrace();
        }

        input.close();

    }
}
