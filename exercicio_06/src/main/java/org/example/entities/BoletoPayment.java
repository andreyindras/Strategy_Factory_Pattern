package org.example.entities;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento via Boleto");
        System.out.println("R$ " + String.format("%.2f", amount));
    }
}
