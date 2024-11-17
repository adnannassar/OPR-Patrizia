package Exceptions;

public class Example {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println(div(10, 0));
        System.out.println("Ende");
    }

    static int div(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division durch 0 ist nicht erlaubt!");
            return -1;
        }

    }

    static void readInfoFromDatabase() {
        try {
            // open the connection to the database
            // do some operations
        } catch (Exception e) {
            // handle exception
        } finally {
            // close the connection to the database
        }
    }


}
