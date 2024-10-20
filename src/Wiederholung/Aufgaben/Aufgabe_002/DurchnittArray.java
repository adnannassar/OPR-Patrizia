package Wiederholung.Aufgaben.Aufgabe_002;

import KlassenhierarchieUndPolymorphie.Vererbung.Student;
import Tools.ArrayTools;

public class DurchnittArray {
    public static void main(String[] args) {
        int [] array = {1, 0, 4, 0, 5};

        System.out.println(ArrayTools.berechneDurchnitt(array));
    }

}
