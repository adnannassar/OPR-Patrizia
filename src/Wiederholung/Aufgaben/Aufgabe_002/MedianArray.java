package Wiederholung.Aufgaben.Aufgabe_002;

import Tools.ArrayTools;

public class MedianArray {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 4, 3, 8};
        int[] array2 = {1, 5, 4, 3, 2, 8};


        System.out.println(ArrayTools.medianArray(array1));
        System.out.println(ArrayTools.medianArray(array2));
    }
}
