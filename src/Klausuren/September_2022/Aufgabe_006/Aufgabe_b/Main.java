package Klausuren.September_2022.Aufgabe_006.Aufgabe_b;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Buch> bücher = List.of(
                new Buch(12.99),
                new Buch(9.99),
                new Buch(15.99),
                new Buch(7.99)
        );

        solveWithFindFirst(bücher);
        solveWithListAndGet(bücher);
    }


    private static void solveWithFindFirst(List<Buch> bücher) {
        Optional<Buch> optionalBuchResult = bücher.stream()
                .filter(b -> b.gibPreisInEuro() < 10)
                .findFirst();

        if (optionalBuchResult.isPresent()) {
            System.out.println(optionalBuchResult.get().gibPreisInEuro());
        } else {
            System.out.println("Kein Buch gefunden");
        }

    }

    private static void solveWithListAndGet(List<Buch> bücher) {
        Buch buch = bücher.stream()
                .filter(b -> b.gibPreisInEuro() < 10)
                .toList()
                .get(0);

        if (buch != null) {
            System.out.println(buch.gibPreisInEuro());
        } else {
            System.out.println("Kein Buch gefunden");
        }
    }
}
