package Wiederholung.Aufgaben.Aufgabe_002;

import java.util.Scanner;

public class Collatzfolge {
    private int collatzlength;

    public static void main(String[] args) {
        Collatzfolge collatzfolge = new Collatzfolge();
        collatzfolge.printMenu();
    }

    private void printMenu() {
        Scanner scanner = new Scanner(System.in);

        int auswahl;

        do {
            System.out.println("--------------------------------");
            System.out.println("1. Collatzfolge für n");
            System.out.println("2. Länge der Collatzfolge für n");
            System.out.println("3. Fertig");
            System.out.println("--------------------------------");


            System.out.print("Bitte geben Sie eine Zahl ein: ");
            int n = scanner.nextInt();

            System.out.print("Bitte wählen Sie eine Option: ");
            auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    System.out.print("Collatzfolge für " + n + ": ");
                    printCollatz(n);
                    break;
                case 2:
                    System.out.println("Länge der Collatz für " + n + ": " + collatzlength);
                    break;
                case 3:
                    System.out.println("Programm beendet");
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
            }
        } while (auswahl != 3);

    }

    private void printCollatz(int n) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 2 != 0 && n % 3 == 0) {
                n = n / 3;
            } else {
                n = n * 3 + 1;
            }
            if (n != 1) {
                System.out.print(n + " -> ");
            } else {
                System.out.print(n);
            }
            collatzlength++;
        }
        System.out.println();

    }
}
