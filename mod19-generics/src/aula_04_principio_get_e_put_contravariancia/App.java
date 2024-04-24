package aula_04_principio_get_e_put_contravariancia;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class App {
    public static void main(String[] args) {

        List<Object> myObjts = new ArrayList<Object>();
        myObjts.add("maria");
        myObjts.add("carlos");

        List<? super Number> myNumbs = myObjts;

        myNumbs.add(10);
        myNumbs.add(3.14);

        //nao pode fazer o get
        //Number x = myNumbs.get(0);
    }
}
