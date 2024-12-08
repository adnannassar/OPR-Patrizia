package Interfaces.StrategyMuster;

public class BankPayment implements PaymentAction {

    @Override
    public void pay(double amount) {
        System.out.println("BankPayment: " + amount);
    }
}
