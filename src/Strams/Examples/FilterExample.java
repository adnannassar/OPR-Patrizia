package Strams.Examples;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
        // old way
        // oldWay();

        // Stream
        Stream
                .of("Shaker", "Amani", "Omar", "Abdou", "Zainab")
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));
    }

    public static void oldWay() {
        LinkedList<String> names = new LinkedList<>(
                List.of("Shaker", "Amani", "Omar", "Abdou", "Zainab"));

        LinkedList<String> filteredList = filterOld(names);
        printOld(filteredList);
    }

    public static LinkedList<String> filterOld(LinkedList<String> names) {
        LinkedList<String> erg = new LinkedList<>();
        for (String name : names) {
            if (name.toLowerCase().startsWith("a")) {
                erg.add(name);
            }
        }
        return erg;
    }

    public static void printOld(LinkedList<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
