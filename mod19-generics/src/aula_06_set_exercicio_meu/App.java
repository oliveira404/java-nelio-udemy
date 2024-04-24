package aula_06_set_exercicio_meu;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        Set<String> a = new LinkedHashSet<>(Arrays.asList("a", "c", "e", "k"));
        Set<String> b = new LinkedHashSet<>(Arrays.asList("b", "d", "f", "k"));

        //uniao
        Set<String> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<String> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<String> e = new TreeSet<>(a);
        c.removeAll(b);
        System.out.println(e);
    }
}