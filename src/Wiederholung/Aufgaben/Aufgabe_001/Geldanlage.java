package Wiederholung.Aufgaben.Aufgabe_001;

import java.util.Scanner;

public class Geldanlage {

    static int laufzeit;
    static double anlagebetrag;

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        int auswahl;
        do {
            auswahl = showMenuAndReaInput();
            doTheCalculation(auswahl);
        } while (auswahl != 5);
    }

    public static double berechneKapital(double zinssatz, int bonus, double anlagebetrag, int laufzeit) {
        for (int i = 1; i < laufzeit; i++) {
            anlagebetrag = anlagebetrag * (1 + zinssatz / 100);
        }
        return anlagebetrag + bonus;
    }

    public static int showMenuAndReaInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nBitte eine Laufzeit in Jahren eingeben: ");
        laufzeit = scanner.nextInt();
        System.out.print("Bitte einen Anlagebetrag eingeben: ");
        anlagebetrag = scanner.nextDouble();
        System.out.println("1: 1,5 % Verzinsung ohne Bonuszahlung");
        System.out.println("2: 0,7 % Verzinsung mit 15 Euro Bonuszahlung");
        System.out.println("3: 0,4 % Verzinsung mit 20 Euro Bonuszahlung");
        System.out.println("4: 0,1 % Verzinsung mit 50 Euro Bonuszahlung");
        System.out.println("5: Fertig");
        System.out.print("Bitte etwas auswählen: ");
        int auswahl = scanner.nextInt();
        return auswahl;
    }

    public static void doTheCalculation(int auswahl) {
        switch (auswahl) {
            case 1:
                System.out.print("Ihr Kapital beträgt: " + berechneKapital(1.5, 0, anlagebetrag, laufzeit));
                break;
            case 2:
                System.out.print("Ihr Kapital beträgt: " + berechneKapital(0.7, 15, anlagebetrag, laufzeit));
                break;
            case 3:
                System.out.print("Ihr Kapital beträgt: " + berechneKapital(0.4, 20, anlagebetrag, laufzeit));
                break;
            case 4:
                System.out.print("Ihr Kapital beträgt: " + berechneKapital(0.1, 50, anlagebetrag, laufzeit));
                break;
            case 5:
                System.out.print("Die App wird geschlossen.");
                break;
            default:
                System.out.println("Bitte wählen Sie eine der Möglichkeiten 1-5 aus: ");
        }
    }

}
