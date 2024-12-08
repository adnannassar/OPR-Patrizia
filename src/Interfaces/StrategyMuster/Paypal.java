package Interfaces.StrategyMuster;

public class Paypal implements PaymentAction {

    @Override
    public void pay(double amount) {
        System.out.println("Paypal: " + amount);
    }
}
