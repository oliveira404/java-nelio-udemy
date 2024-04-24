package exercicio_1.entities;

public interface OnlinePaymentService {

    Double paymentFee(Double amount);
    Double interest(Double amount, Integer months);
}
