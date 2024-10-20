package Tools;

public class ArrayTools {
    // print 2dArray
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static int berechneDurchnitt(int[] array) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                sum = sum + array[i];
                count++;
            }
        }
        return sum / count;
    }

    public static float medianArray(int[] array) {
        // ungerade länge
        if (array.length % 2 != 0) {
            return array[array.length / 2];
        } else {
            // gerade länge
            float b = array[array.length / 2];
            float a = array[(array.length / 2) - 1];
            return (a + b) / 2;
        }
    }
}
