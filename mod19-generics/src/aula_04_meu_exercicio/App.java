package aula_04_meu_exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> listaInt = Arrays.asList(1, 2);
        List<Double> listaDouble = Arrays.asList(10.0, 20.0);

        List<Object> objectList = new ArrayList<>();

        copy(listaInt, objectList);
        copy(listaDouble, objectList);
        printList(objectList);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o + " ");
        }
        System.out.println();
    }
}
