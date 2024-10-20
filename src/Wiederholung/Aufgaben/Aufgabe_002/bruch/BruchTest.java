package Wiederholung.Aufgaben.Aufgabe_002.bruch;

public class BruchTest {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(2, 3);

        Bruch kehrwertVonB1 = b1.kehrwert();
        System.out.println("B1: " + b1.getZaehler() + "/" + b1.getNenner()); // 2/3
        System.out.println("kehrwertVonB1: " + kehrwertVonB1.getZaehler() + "/" + kehrwertVonB1.getNenner()); // 3/2

        Bruch c = new Bruch(4, 5);

        Bruch mulBruch = b1.multiplizieren(c);

        System.out.println("mulBruch: " + mulBruch.getZaehler() + "/" + mulBruch.getNenner()); // 8/15

    }
}
