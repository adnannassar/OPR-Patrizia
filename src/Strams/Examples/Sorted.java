package Strams.Examples;

import java.util.stream.Stream;

public class Sorted {
    public static void main(String[] args) {
        Stream
                .of("Shaker", "Amani","Zainab", "Nesrin", "Klausur_Extra", "Omar", "Abdou", "Mariam")
                .sorted()
                .forEach(name -> System.out.println(name));
    }
}
