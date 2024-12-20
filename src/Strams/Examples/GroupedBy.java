package Strams.Examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupedBy {
    public static void main(String[] args) {
        // group by the first character of the name
        Map<Character, List<String>> map =
                Stream
                        .of("Shaker", "Amani", "Zainab", "Nesrin", "Klausur_Extra", "Omar", "Abdou", "Mariam")
                        .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(map);


        // group by the length of the name
        Map<Integer, List<String>> map2 =
                Stream
                        .of("Shaker", "Amani", "Zainab", "Nesrin", "Klausur_Extra", "Omar", "Abdou", "Mariam")
                        .collect(Collectors.groupingBy(name -> name.length()));
        System.out.println(map2);
    }
}
