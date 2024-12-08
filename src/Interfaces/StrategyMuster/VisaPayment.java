package Interfaces.StrategyMuster;

public class VisaPayment implements PaymentAction {

    @Override
    public void pay(double amount) {
        System.out.println("VisaPayment: " + amount);
    }
}
