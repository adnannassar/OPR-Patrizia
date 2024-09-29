package Wiederholung.Array.TwoDimArray.FirstSteps;

public class Main {
    public static void main(String[] args) {
        // daten bekannt!
        int[][] array = {{10, 20, 30}, {40, 50}, {70, 80, 90}};
        System.out.println("Wiederholung.Array 1: ");
        System.out.println("Length von Array1: " + array.length);
        System.out.println("Length von Array1 at index1: " + array[1].length);
        System.out.println("Value of index 1,1 in Wiederholung.Array 1 = " + array[1][1]);
        System.out.println("Value of index 2,2 in Wiederholung.Array 1 = " + array[2][2]);


        // daten unbekannt!
        int[][] array2 = new int[3][2];
        //{
        // {0, 0},
        // {0, 0},
        // {0, 0}
        //}
        array2[0][0] = 15;
        //{
        // {15, 0},
        // {0, 0},
        // {0, 0}
        //}
        array2[1][1] = -5;
        //{
        // {15, 0},
        // {0, -5},
        // {0, 0}
        //}


        System.out.println("\nWiederholung.Array 2: ");
        System.out.println("Length von Array2: " + array2.length);
        System.out.println("Value of index 0,0 in Wiederholung.Array 2 = " + array2[0][0]);
        System.out.println("Value of index 1,1 in Wiederholung.Array 3 = " + array2[1][1]);
        System.out.println("Value of index 2,0 in Wiederholung.Array 2 = " + array2[2][0]);

    }
}
