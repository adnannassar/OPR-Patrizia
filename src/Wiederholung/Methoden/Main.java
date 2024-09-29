package Wiederholung.Methoden;

public class Main {
    public static void main(String[] args) {
        int result = add(10,20);
        System.out.println("Result1 = " + result);
        int result1 = add(30,40);
        System.out.println("Result2 = " + result1);
    }

    public static int add(int x , int y) {
        int result = x+y;
        return result;
    }
}
