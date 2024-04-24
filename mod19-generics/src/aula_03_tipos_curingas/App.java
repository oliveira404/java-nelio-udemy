package aula_03_tipos_curingas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("carlos", "pedro", "miguel");
        printList(myStrs);
    }

    public static void printList(List<?> list) {
        //proibido
        //list.add(3);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

