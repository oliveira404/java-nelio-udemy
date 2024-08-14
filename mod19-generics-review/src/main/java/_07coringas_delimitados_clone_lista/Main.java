package _07coringas_delimitados_clone_lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        printList(myObjs);

        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    //Lista de origem covariância trabalhando com subtipos / get
    //Lista de destino contravariância trabalhando com supertipos / put

    //A lista de origem vai ser uma lista de qualquer tipo, que extends Number.
    //A lista de destino é uma lista de qualquer tipo, que pode ser um super tipo de Number.
    public static void copy(List<? extends Number> origem, List<? super Number> destino) {
        for (Number number : origem) {
            destino.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object objetoQualquer : list) {
            System.out.print(objetoQualquer + " ");
        }
        System.out.println();
    }
}
