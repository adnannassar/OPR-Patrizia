package Lambdas.GreetingExample;

public class Greeting {
    public static void main(String[] args) {
        // Normal way of creating an object
        GermanGreeter germanGreeter = new GermanGreeter();


        // Using lambda expression
        Greeter englishAction = () -> System.out.println("Hello");

        // Using Inline implementation
        Greeter spanishAction = new Greeter() {
            @Override
            public void greet() {
                System.out.println("Hola");
            }
        };

        greet(germanGreeter);
        greet(englishAction);
        greet(spanishAction);
    }

    public static void greet(Greeter greeter) {
        greeter.greet();
    }
}
