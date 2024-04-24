package aula_05_equals_hashcode;

import aula_05_equals_hashcode.entities.Client;

public class App {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Teste";
        String s2 = new String("Teste");

        //-495238894
        System.out.println(c1.hashCode());

        //-495238894
        System.out.println(c2.hashCode());

        //true
        System.out.println(c1.equals(c2));

        //false
        System.out.println(c1 == c2);

        //false
        System.out.println(s1 == s2);
    }
}
