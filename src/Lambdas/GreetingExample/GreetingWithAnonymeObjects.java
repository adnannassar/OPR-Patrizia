package Lambdas.GreetingExample;

public class GreetingWithAnonymeObjects {
    public static void main(String[] args) {
        // Normal way of creating an anonym object
        greet(new GermanGreeter());

        // Using lambda expression
        greet(() -> System.out.println("Hello"));

        // Using anonym Inline implementation
        greet(new Greeter() {
            @Override
            public void greet() {
                System.out.println("Hola");
            }
        });
    }

    public static void greet(Greeter greeter) {
        greeter.greet();
    }
}
