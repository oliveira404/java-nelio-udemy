package _05funcoes_que_recebe_funcoes_como_parametro;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    // vamos passar um predicado, para que a logica nao fique tao fechada.
    // complicando a manuntencao fufura ou alteracao do predicado por outro tipo.
    public static double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product product : list) {
            //if (p.getName().charAt(0) == 'T') {
            if (criteria.test(product)) {
                sum = sum + product.getPrice();
            }
        }
        return sum;
    }
}
