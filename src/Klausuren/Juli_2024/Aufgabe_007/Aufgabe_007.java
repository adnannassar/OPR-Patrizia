package Klausuren.Juli_2024.Aufgabe_007;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Aufgabe_007 {
    public static void main(String[] args) {
        // createTreeSetAndSortUsingLambda();
        createTreeSetAndSortSuingAnonymeKlasse();
    }

    private static void createTreeSetAndSortSuingAnonymeKlasse() {
        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                o1 = o1.replace(" ", "");
                o2 = o2.replace(" ", "");
                return o1.compareTo(o2);
            }
        });

        set.add("zu viel");
        set.add("zug");
        set.add("zum");

        for (String s : set) {
            System.out.println(s);
        }

    }

    private static void createTreeSetAndSortUsingLambda() {
        Set<String> set = new TreeSet<>((o1, o2) -> {
            o1 = o1.replace(" ", "");
            o2 = o2.replace(" ", "");
            return o1.compareTo(o2);
        });

        set.add("zu viel");
        set.add("zug");
        set.add("zum");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
