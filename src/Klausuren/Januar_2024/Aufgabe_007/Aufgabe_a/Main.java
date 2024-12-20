package Klausuren.Januar_2024.Aufgabe_007.Aufgabe_a;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Collection<Rechteck> rechtecke = List.of(
                new Rechteck(2, 2),
                new Rechteck(3, 4),
                new Rechteck(5, 5),
                new Rechteck(7, 8)
        );

        float summe = rechtecke
                .stream()
                .filter(r -> r.istQuadratisch())
                .map(r -> r.fläche())
                .reduce(0f, (a, b) -> a + b);

        System.out.println("Summe = " + summe);
    }
}
