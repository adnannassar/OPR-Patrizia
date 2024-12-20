package Klausuren.Juli_2024.Aufgabe_008.Aufgabe_c;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {

        LongStream longStream =
                LongStream
                        .iterate(2, n -> n * 2 - 1) // Die Regel der Sequenz
                        .takeWhile(n -> n > 0); // Stoppt, wenn der Wert negativ wird

        longStream.forEach(System.out::println);

    }
}
