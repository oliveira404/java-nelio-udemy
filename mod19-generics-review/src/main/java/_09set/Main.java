package _09set;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //DEMO 1
        /*Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        set.removeIf(x -> x.charAt(0) == 'T');

        //System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }*/


        //DEMO 2
        /*Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);*/

        //DEMO 3
        HashSet<Integer> meuSet = new HashSet<>();
        meuSet.add(1);
        meuSet.add(2);
        meuSet.add(3);

        System.out.println("Antes de clear(): " + meuSet);

        // Limpa o conjunto
        //meuSet.clear();

        System.out.println("Depois de clear(): " + meuSet);

    }
}
