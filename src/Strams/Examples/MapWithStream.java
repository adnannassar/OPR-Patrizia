package Strams.Examples;

import java.util.Arrays;
import java.util.stream.Stream;

public class MapWithStream {
    public static void main(String[] args) {
        System.out.println("Streams of Integers with map");
        Stream
                .of(5, 2, 1, 3, 4)
                .map(n -> n * 2)
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nStreams of Students with map");
        Stream
                .of(
                        new Student("Shaker", 20),
                        new Student("Amani", 21),
                        new Student("Omar", 22))
                .map(n -> n.age)
                .forEach(s -> System.out.print(s + " "));

    }
}


