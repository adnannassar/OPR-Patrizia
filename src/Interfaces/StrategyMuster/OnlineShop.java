package Interfaces.StrategyMuster;


public class OnlineShop {
    private PaymentAction paymentAction;

    public void setPaymentAction(PaymentAction paymentAction) {
        this.paymentAction = paymentAction;
    }

    public void pay(double amount) {
        paymentAction.pay(amount);
        System.out.println(amount + "€ paid using " + paymentAction.getClass().getSimpleName());
    }
}
