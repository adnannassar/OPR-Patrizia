package Strams.Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxCount {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 10);
        Optional<Integer> min = list.stream().min((a, b) -> a - b);
        Optional<Integer> max = list.stream().max((a, b) -> a - b);

        long count = list.stream().count();

        System.out.println("Min  " + min.get());
        System.out.println("Max  " + max.get());
        System.out.println("Count " + count);
    }
}
