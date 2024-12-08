package Interfaces.StrategyMuster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie möchten Sie zahlen? (1.paypal, 2.visa, 3.bank)");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                shop.setPaymentAction(new Paypal());
                break;
            case 2:
                shop.setPaymentAction(new VisaPayment());
                break;
            case 3:
                shop.setPaymentAction(new BankPayment());
                break;
            default:
                System.out.println("Ungültige Eingabe");
        }

        shop.pay(100);
    }
}
