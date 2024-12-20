package Klausuren.Januar_2024.Aufgabe_007.Aufgabe_b;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(3, 1, 15, 7, 31)
                .filter(n -> isPrimZahl(n))
                .sorted()
                .forEach(n -> System.out.println(n));
    }

    private static boolean isPrimZahl(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
