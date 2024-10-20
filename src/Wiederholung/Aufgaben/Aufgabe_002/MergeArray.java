package Wiederholung.Aufgaben.Aufgabe_002;

import Tools.ArrayTools;

public class MergeArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 8, 4, 6};


        int[] c = merge(a, b); // {1, 2, 3, 4, 5, 6, 7, 8}


        ArrayTools.printArray(c);
    }

    public static int[] merge(int[] a, int[] b) {
        int C_LENGTH = a.length + b.length;
        int[] c = new int[C_LENGTH]; // {0, 0, 0, 0, 0, 0, 0, 0}

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = a.length, j = 0; i < c.length; i++, j++) {
            c[i] = b[j];
        }

        ArrayTools.bubbleSort(c);

        return c;
    }


}
