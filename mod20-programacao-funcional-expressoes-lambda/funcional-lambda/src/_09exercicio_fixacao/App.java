package _09exercicio_fixacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String path = "/home/shark/workspace/back-end/java-nelio-udemy/mod20-programacao-funcional-expressoes-lambda/funcional-lambda/src/_09exercicio_fixacao/info.csv";

        System.out.println("full file path: Automatic Insertion!\n");
        System.out.print("Enter salary: ");
        Double salarioPassadoUsuario = entrada.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Funcionario> funcionarioList = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] filds = line.split(",");
                funcionarioList.add(new Funcionario(filds[0], filds[1], Double.parseDouble(filds[2])));
                line = br.readLine();
            }

            //Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<Funcionario> funcionariosFiltroEmailList = funcionarioList.stream()
                    .sorted()
                    .filter(funcionario -> funcionario.getSalary() > salarioPassadoUsuario)
                    .toList();

            System.out.printf("Email of people whose salary is more than %.2f:\n", salarioPassadoUsuario);
            funcionariosFiltroEmailList.forEach(funcionario -> System.out.println(funcionario.getEmail()));

            List<Funcionario> funcionariosQueComecamComM = funcionarioList;
            funcionariosQueComecamComM.removeIf(funcionario -> funcionario.getName().charAt(0) != 'M');

            // Mais rápido
            double sum = funcionarioList.stream().mapToDouble(Funcionario::getSalary).sum();

            // menos rápido
            //double sum = funcionarioList.stream().map(Funcionario::getSalary).reduce(0.0, (soma, salary) -> soma + salary);
            System.out.printf("Sum of salary of people whose name starts with 'M' %.2f:", sum);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        entrada.close();
    }
}



/*
*
*
* */