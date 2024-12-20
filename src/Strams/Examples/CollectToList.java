package Strams.Examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToList {
    public static void main(String[] args) {
        List<String> list =
                Stream
                .of("Shaker", "Amani", "Zainab", "Nesrin", "Klausur_Extra", "Omar", "Abdou", "Mariam")
                .filter(name -> name.toLowerCase().endsWith("r"))
                .toList();
    }
}
