package Klausuren.September_2022.Aufgabe_004;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Set<Rechteck> set = new HashSet<>();

        Rechteck r1 = null;

        try {
            r1 = new Rechteck(-20, -20);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        if (r1 != null) {
            System.out.println("r1 ist nicht null");
        } else {
            System.out.println("r1 ist null");
        }


        set.add(new Rechteck(10, 20));
        set.add(new Rechteck(10, 20));

        set.add(new Rechteck(20, 30));
        set.add(new Rechteck(1, 2));

        System.out.println(set);

    }
}
