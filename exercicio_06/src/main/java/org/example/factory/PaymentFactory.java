package org.example.factory;

import org.example.entities.BoletoPayment;
import org.example.entities.CreditCardPayment;
import org.example.entities.PaymentStrategy;
import org.example.entities.PixPayment;

public class PaymentFactory {
    public static PaymentStrategy cratePayment(String type){
        switch (type) {
            case "pix":
                return new PixPayment();
            case "cartao de credito":
                return new CreditCardPayment();
            case "boleto":
                return new BoletoPayment();
            default:
                throw new IllegalArgumentException("Erro ao selecionar um tipo de pagamento");
        }
    }
}
