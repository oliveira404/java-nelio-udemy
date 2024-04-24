package aula_04_principio_get_e_put_convariancia;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;
        Number x = list.get(0);

        //nao pode fazer o put
        //list.add(20);

    }

}
