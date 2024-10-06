package Wiederholung.Aufgaben.Aufgabe_001.LoopsUebung;

import java.util.Scanner;

public class MultiTabelle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int zahl = in.nextInt();
        for(int i = 1; i <= zahl; i++) {
            multiTableForNumber(i);
            System.out.println();
        }

    }

    public static void multiTableForNumber(int zahl){
        int ergebnis;
        for (int i = 1; i <= 10; i++) {
            ergebnis = zahl * i;
            System.out.println(zahl + " * " + i + " = " + ergebnis);
        }
    }
}
