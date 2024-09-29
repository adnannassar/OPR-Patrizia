package Wiederholung.Array.OneDimArray.FirstSteps;

public class Main {
    public static void main(String[] args) {
        // daten bekannt!
        int[] array = {10, 20, 30, 40, 50}; // {10, 20, 30, 40, 50}
        System.out.println("Wiederholung.Array 1: ");
        System.out.println("Length von Array1: " + array.length);
        System.out.println("Value of index 0 in Wiederholung.Array 1 = " + array[0]);
        System.out.println("Value of index 4 in Wiederholung.Array 1 = " + array[4]);


        // daten unbekannt!
        int[] array2 = new int[6];  // {0, 0, 0, 0, 0}
        array2[0] = 15; // {15, 0, 0, 0, 0}
        array2[3] = -5; // {15, 0, 0, -5, 0}


        System.out.println("\nWiederholung.Array 2: ");
        System.out.println("Length von Array2: " + array2.length);
        System.out.println("Value of index 0 in Wiederholung.Array 2 = " + array2[0]);
        System.out.println("Value of index 3 in Wiederholung.Array 3 = " + array2[3]);
        System.out.println("Value of index 4 in Wiederholung.Array 2 = " + array2[4]);

    }
}
