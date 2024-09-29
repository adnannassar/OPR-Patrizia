package Wiederholung.Grundlagen;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int x = 10;
        int y = 20;
        int auswahl;
        do {
            System.out.println("1-Add");
            System.out.println("2-Sub");
            System.out.println("3-Mul");
            System.out.println("4-Div");
            System.out.println("5-Exit");

            System.out.print("Bitte etwas auswählen: ");
            auswahl = scanner.nextInt();
            switch (auswahl) {
                case 1:
                    System.out.println(x + y);
                    break;
                case 2:
                    System.out.println(x - y);
                    break;
                case 3:
                    System.out.println(x * y);
                    break;
                case 4:
                    System.out.println(x / y);
                    break;
                case 5:
                    System.out.println("App wurde geschloßen");
                    break;
                default:
                    System.out.println("Bitte etwas gültiges eingeben");
            }
        } while (auswahl != 5);

        // Arrays? 50%


    }
}
