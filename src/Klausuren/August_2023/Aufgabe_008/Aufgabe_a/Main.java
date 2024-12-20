package Klausuren.August_2023.Aufgabe_008.Aufgabe_a;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Konto> konten = new LinkedHashSet<>();

        konten.add(new Konto(1000, true));
        konten.add(new Konto(3000, true));
        konten.add(new Konto(5000, true));

        konten.add(new Konto(2000, false));
        konten.add(new Konto(4000, false));


        float summLambda = konten.stream()
                .filter(k -> k.isPrivatkonto())
                .map(k -> k.getKontostand())
                .reduce(0.0f, (k1, k2) -> k1 + k2);

        System.out.println("Summe der Privatkonto: " + summLambda);



        // Alternative
        float summLambdaReference = konten.stream()
                .filter(Konto::isPrivatkonto)
                .map(Konto::getKontostand)
                .reduce(0.0f, Float::sum);

        System.out.println("Summe der Privatkonto: " + summLambdaReference);

    }
}
