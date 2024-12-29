package Klausuren.September_2022.Aufgabe_006.Aufgabe_c;

import AnonymClass.Student;

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

        solveWithReduce(bücher);
        solveWithMapToDoubleAndSum(bücher);
    }


    private static void solveWithReduce(List<Buch> bücher) {
        Optional<Double> optionalSumme = bücher.stream()
                .filter(b -> b.gibPreisInEuro() > 10)
                .map(b -> b.gibPreisInEuro())
                .reduce(Double::sum);

        if (optionalSumme.isPresent()) {
            System.out.println("Summe = " + optionalSumme.get());
        } else {
            System.out.println("Summe = 0");
        }
    }

    private static void solveWithMapToDoubleAndSum(List<Buch> bücher) {
        double summe = bücher.stream()
                .filter(b -> b.gibPreisInEuro() > 10)
                .mapToDouble(b -> b.gibPreisInEuro())
                .sum();
        System.out.println("Summe = " + summe);
    }
}
