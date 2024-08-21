package _14_map1;

import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        //String já tem implementacao de equails hahscode e compareto
        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "40028922");

        cookies.remove("email");
        //ele vai sobrescrever
        cookies.put("phone", "40020000");

        System.out.println("Contains  'phone' key: " + cookies.containsKey("phone"));
        System.out.println("get Phone number " + cookies.get("phone"));
        System.out.println("empty email " + cookies.get("email"));
        System.out.println("size " + cookies.size());

        System.out.println("All cookies");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
