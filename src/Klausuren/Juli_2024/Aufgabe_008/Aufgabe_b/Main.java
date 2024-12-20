package Klausuren.Juli_2024.Aufgabe_008.Aufgabe_b;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> s = new LinkedHashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(5);
        s.add(10);
        s.add(2);


        int summe = s
                .stream()
                .filter(x -> x % 2 != 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println("summe = " + summe);
    }
}
