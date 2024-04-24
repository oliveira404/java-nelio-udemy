/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author igor
 */
public class funcionarioMain {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        int quantidadeEscolhidaUser;
        int c = 0;
        Long IdFuncionario;
        int porcentagem = 0;
        Double novoSalario;

        System.out.print("Quantos Funcionários serão registrados? ");
        quantidadeEscolhidaUser = entrada.nextInt();
        entrada.nextLine();

        while (c < quantidadeEscolhidaUser) {
            System.out.println("Funcionário #" + (c + 1) + ":");
            System.out.print("Id: ");
            Long id = entrada.nextLong();
            entrada.nextLine();

            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            System.out.print("Salário: ");
            Double salario = entrada.nextDouble();

            //new Funcionario(id, nome, salario);
            funcionarios.add(new Funcionario(id, nome, salario));

            c++;
        }

        System.out.println("");

        System.out.print("Entre com o id do funcionário que irá receber aumento de salário: ");
        IdFuncionario = entrada.nextLong();
        entrada.nextLine();

        List<Funcionario> unicoFuncionarioEncontrado = funcionarios.stream().filter(x -> x.id.equals(IdFuncionario)).collect(Collectors.toList());
        
        //testar dps
        /*Funcionario emp = funcionarios.stream().filter(x -> x.id == IdFuncionario).findFirst().orElse(null);*/

        //vai da empt pq o filter lá em cima deu false
        if (unicoFuncionarioEncontrado.isEmpty()) {
            System.out.println("Esse id não existe!");
        } else {
            System.out.print("Entre com porcentagem: ");
            porcentagem = entrada.nextInt();
            entrada.nextLine();
        }

        for (Funcionario f : unicoFuncionarioEncontrado) {
            f.salario = f.salario + ((double) porcentagem / (double) 100) * f.salario;
        }

        System.out.println("");
        System.out.println("Lista de empregados");
        funcionarios.forEach(funcionario -> System.out.println(funcionario));

    }

}
