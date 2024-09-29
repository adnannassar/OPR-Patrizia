package Wiederholung.Array.TwoDimArray.SecondSteps;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        //{
        // {0, 0, 0, 0, 0},
        // {0, 0, 0, 0, 0},
        // {0, 0, 0, 0, 0},
        // {0, 0, 0, 0, 0},
        // {0, 0, 0, 0, 0}
        //}

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i +j;
            }
        }


        System.out.println("Erstes Wiederholung.Array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        int[][] array2 = {
                {1, 2, 3, 4, 5},
                {6, 7},
                {9, 8, 10, 11},
        };

        System.out.println("Zweites Wiederholung.Array");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }



    }
}
