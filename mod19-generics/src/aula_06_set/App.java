package aula_06_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        //Operações
        //set.remove("Tablet");
        //set.removeIf(x -> x.length() >= 3);
        set.removeIf(x -> x.charAt(0) == 'T'); //isso que passamos dentro é o predicado

        for (String p : set) {
            System.out.println(p);
        }
    }
}
