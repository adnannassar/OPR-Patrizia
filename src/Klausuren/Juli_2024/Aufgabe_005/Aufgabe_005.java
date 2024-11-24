package Klausuren.Juli_2024.Aufgabe_005;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe_005 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hallo"); // 5
        list.add("Welt"); // 4
        list.add("wie geht's"); // 10
        list.add("dir"); // 3

        printsizes(list);
    }

    public static void printsizes(List<String> liste) {
        for (String s : liste) {
            System.out.println(s.length());
        }
    }
}
