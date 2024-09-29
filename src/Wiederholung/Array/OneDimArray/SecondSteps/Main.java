package Wiederholung.Array.OneDimArray.SecondSteps;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[1000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * i + 2;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
