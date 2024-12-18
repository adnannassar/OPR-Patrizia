package Klausuren.August_2023.Aufgabe_007;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //createTreeSetAndSortUsingLambda();

        createTreeSetAndSortUsingAnonymeKlasse();
    }

    private static void createTreeSetAndSortUsingLambda() {
        Set<String> woerter = new TreeSet<>((wort1, wort2) -> {
            if (wort1.length() == wort2.length()) {
                // alphabetisch sortieren
                return wort1.compareTo(wort2);
            } else {
                // nach Länge sortieren
                return wort1.length() - wort2.length();
            }
        });
        woerter.add("Birne");
        woerter.add("Apfel");
        woerter.add("Banane");
        woerter.add("Zitrone");
        woerter.add("Orange");
        woerter.add("Kirsche");
        woerter.add("Erdbeere");
        woerter.add("Himbeere");
        woerter.add("Blaubeere");
        woerter.add("Mango");

        for (String wort : woerter) {
            System.out.println(wort);
        }

    }

    private static void createTreeSetAndSortUsingAnonymeKlasse() {
        Set<String> woerter = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    // alphabetisch sortieren
                    return o1.compareTo(o2);
                } else {
                    // nach Länge sortieren
                    return o1.length() - o2.length();
                }
            }
        });
        woerter.add("Birne");
        woerter.add("Apfel");
        woerter.add("Banane");
        woerter.add("Zitrone");
        woerter.add("Orange");
        woerter.add("Kirsche");
        woerter.add("Erdbeere");
        woerter.add("Himbeere");
        woerter.add("Blaubeere");
        woerter.add("Mango");

        for (String wort : woerter) {
            System.out.println(wort);
        }

    }

}
