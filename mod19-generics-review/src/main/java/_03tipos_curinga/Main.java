package _03tipos_curinga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        List<String> myStrs = Arrays.asList("igor", "carlos", "pedro");

        printList(myInts);
        printList(myStrs);
    }

    public static void printList (List<?> list){
        //list.add(1);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
