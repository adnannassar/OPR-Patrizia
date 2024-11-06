package Klausuren.September_2022;

public class Main {
    public static void main(String[] args) {
        Zeichenobjekt z1 = new Rechteck(2, 3);
        Zeichenobjekt z2 = new Kreis(5);


        System.out.println(z1.gibText());
        System.out.println(z2.gibText());
    }
}
