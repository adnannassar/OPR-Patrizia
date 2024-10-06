package Wiederholung.Ueberladen;

public class Main {
    public static void main(String[] args) {
        test1(1, "Test", 1.1f);
    }

    // Überladen --> Overload
    public static void test1(int a , String b) {
        System.out.println("Integer: " + a);
    }

    public static void test1(int a , String b, float x) {
        System.out.println("Character: " + a);
    }
}
