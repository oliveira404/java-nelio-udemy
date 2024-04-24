package revisao_geral_sobre_interfaces.service;

public class PaypalService implements OnlinePaymentService{
    @Override
    public Double paymentFree(Double amount) {
        return null;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return null;
    }
}
