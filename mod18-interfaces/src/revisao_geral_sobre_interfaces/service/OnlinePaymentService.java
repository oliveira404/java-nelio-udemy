package revisao_geral_sobre_interfaces.service;

public interface OnlinePaymentService {

    Double paymentFree(Double amount);
    Double interest(Double amount, Integer months);
}
