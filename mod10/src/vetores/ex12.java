/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author igor
 */
public class ex12 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int leituraQuantidadeQuartos;
        Integer pegaNumeroQuarto;
        int numeroQuartoAnterior = 0;
        Aluno[] conjuntoAluno = new Aluno[11];
        Aluno aluno;

        System.out.print("Quantos quartos você vai ler ? ");
        leituraQuantidadeQuartos = entrada.nextInt();
        entrada.nextLine();

        for (int i = 1; i <= leituraQuantidadeQuartos; i++) {
            aluno = new Aluno();
            //esqueletoAluno = new Aluno();

            System.out.print("Rent #" + i);

            System.out.print("\nName: ");
            aluno.nome = entrada.nextLine();

            System.out.print("Email: ");
            aluno.email = entrada.next();

            System.out.print("Room: ");
            pegaNumeroQuarto = entrada.nextInt();
            aluno.numeroDoQuarto = pegaNumeroQuarto;
            entrada.nextLine();

            conjuntoAluno[pegaNumeroQuarto] = aluno;
        }

        System.out.println("Busy Rooms:");
        for (int i = 1; i <= leituraQuantidadeQuartos; i++) {
            if (conjuntoAluno[i] != null) {
                if (conjuntoAluno[i].numeroDoQuarto > numeroQuartoAnterior) {
                    numeroQuartoAnterior = conjuntoAluno[i].numeroDoQuarto;

                    System.out.println(conjuntoAluno[i].numeroDoQuarto + ": "
                            + conjuntoAluno[i].nome + ", "
                            + conjuntoAluno[i].email);
                } else {
                    System.out.println(conjuntoAluno[i].numeroDoQuarto + ": "
                            + conjuntoAluno[i].nome + ", "
                            + conjuntoAluno[i].email);
                }
            }
        }
        
        
        entrada.close();

    }

}
