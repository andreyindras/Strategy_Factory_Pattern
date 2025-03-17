package org.example.entities;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento via Cartão de Crédito");
        System.out.println("R$ " + String.format("%.2f", amount));
    }
}
