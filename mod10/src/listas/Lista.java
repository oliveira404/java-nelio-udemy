/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author igor
 */
public class Lista {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("maria");
        list.add("marcos");
        list.add("bob");
        list.add("rodrigo");
        list.add("roger");
        list.add("fernando");
        list.add("xuxa");
        list.add("xana");
        list.add("xuxu");

        list.add(0, "tião");

        list.remove("maria");
        list.remove(0);

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("================");

        list.removeIf(x -> x.charAt(0) == 'r');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------");

        System.out.println("Index of bob: " + list.indexOf("bob"));
        System.out.println("Index of quando n acha retorna -1: " + list.indexOf("lucas"));

        System.out.println("=========================");
        System.out.println("Só nome com x");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'x').collect(Collectors.toList()); //stream aceita expressoes lambda

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("=========================");
        String name = list.stream().filter(x -> x.charAt(0) == 'x').findFirst().orElse(null);//se n existir retorna nulo

        System.out.println(name);


    }

}
