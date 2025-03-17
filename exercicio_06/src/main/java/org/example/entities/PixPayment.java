package org.example.entities;

public class PixPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento via Pix");
        System.out.println("R$ " + String.format("%.2f", amount));
    }
}
