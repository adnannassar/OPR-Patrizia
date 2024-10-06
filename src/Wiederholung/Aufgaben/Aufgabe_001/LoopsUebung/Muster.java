package Wiederholung.Aufgaben.Aufgabe_001.LoopsUebung;

public class Muster {
    public static void main(String[] args) {
        char[][] array = new char[5][5];
        // musterX(array);
        musterA(array);
        printArray(array);
    }

    public static void musterX(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = '*';
                } else if (i + j == array.length - 1) {
                    array[i][j] = '*';
                } else if (j == array.length / 2) {
                    array[i][j] = '*';
                } else if (i == array.length / 2) {
                    array[i][j] = '*';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
    }

    public static void musterA(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    array[i][j] = 'A';
                } else if (j % 2 == 0 && i % 2 != 0) {
                    array[i][j] = 'A';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
    }

    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
