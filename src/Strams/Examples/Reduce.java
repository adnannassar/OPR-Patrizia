package Strams.Examples;

import java.util.Arrays;

public class Reduce {
    public static void main(String[] args) {
        double array[] = {1, 2, 3, 4};
        double summ = Arrays.stream(array)
                .reduce(1, (a, b) -> a * b);
        System.out.println(summ);
    }
}
