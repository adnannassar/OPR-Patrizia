package AnonymClass;


public class Example {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 30);
        s1.age = 40;
        System.out.println(s1);

        System.out.println(new Student("Carlos", 20));

        // anonym inline implementation
        pay(new PaymentAction() {
            @Override
            public void pay(double amount) {
                System.out.println("Paypal");
            }
        }, 500);


        System.out.println(new Form() {
            @Override
            public double berechneFlaeche() {
                return 0;
            }
        });


        pay(new PaymentAction() {
            @Override
            public void pay(double amount) {
                System.out.println("Paypal");
            }
        }, 500);

    }

    public static void pay(PaymentAction paymentAction, double amount) {
        System.out.println("Es wird bezahlt!");
    }
}
