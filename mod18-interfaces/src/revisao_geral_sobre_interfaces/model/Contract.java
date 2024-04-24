package revisao_geral_sobre_interfaces.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private Integer number;
    private Date date;
    private Double totalValue;
    private List<Installment> installment = new ArrayList<>();


}
