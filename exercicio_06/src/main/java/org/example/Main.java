package org.example;

import org.example.entities.PaymentStrategy;
import org.example.factory.PaymentFactory;
import org.example.service.PaymentProcessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione o método de pagamento que deseja:");
        System.out.println("(1) - Pix");
        System.out.println("(2) - Cartão de Crédito");
        System.out.println("(3) - Boleto");
        System.out.print("Opção: ");
        int op = sc.nextInt();

        String type;
        switch (op) {
            case 1:
                type = "pix";
                break;
            case 2:
                type = "cartao de credito";
                break;
            case 3:
                type = "boleto";
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.print("Digite o valor da transação: ");
        sc.nextLine();
        double amount = sc.nextDouble();

        PaymentStrategy paymentStrategy = PaymentFactory.cratePayment(type);
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.processPayment(amount);

        sc.close();
    }
}