import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Sete_Desafio {
    public static void main(String[] args) {

        String caminhoDeEntrada = "/home/duke/workspaces/back-end/java-nelio/mod17-arquivos/outros/vendas.csv";
        String caminhoDeSaida = "/home/duke/workspaces/back-end/java-nelio/mod17-arquivos/outros/porra";

        List<Product> listaDeProdutos = new ArrayList<>();

        lerArquivoCSVeCriaListaDeProduto(caminhoDeEntrada, listaDeProdutos);

        criaArquivoCSVcomProdutosAtualizados(caminhoDeSaida, listaDeProdutos);
    }

    private static void criaArquivoCSVcomProdutosAtualizados(String caminhoDeSaida, List<Product> listaDeProdutos) {
        //Salvar info de produtos no arquivo csv.
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(caminhoDeSaida, false))) { //esse true ele nao vai recriar e sim juntar
            for (Product productFormatado : listaDeProdutos) {
                bufferedWriter.write(productFormatado.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void lerArquivoCSVeCriaListaDeProduto(String caminhoDeEntrada, List<Product> productList) {
        String[] nome;
        String[] preco;
        String[] quantidade;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoDeEntrada))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                String produtosConvertidos[] = line.split(",");
                quantidade = new String[]{produtosConvertidos[2]};
                nome = new String[]{produtosConvertidos[0]};
                preco = new String[]{produtosConvertidos[1]};

                line = bufferedReader.readLine();

                for (int i = 0; i < nome.length; i++) {
                    for (int j = 0; j < preco.length; j++) {
                        for (int k = 0; k < quantidade.length; k++) {
                            productList.add(new Product(nome[i], preco[j], quantidade[k]));
                        }
                    }
                }

            }
            //productList.forEach(elemento -> System.out.print(elemento + "\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
