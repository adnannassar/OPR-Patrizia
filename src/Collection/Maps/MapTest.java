package Collection.Maps;

import Klausuren.August_23.Aufgabe_001.Main;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Float> studentenMap = new HashMap<>();

        studentenMap.put("Patrizia", 1.3f);
        studentenMap.put("Mehmet", 2.0f);
        studentenMap.put("Sandra", 1.7f);
        studentenMap.put("Klaus", 3.0f);
        studentenMap.put("Adnan", 3.3f);

        System.out.println(studentenMap);

        System.out.println("Note von Patrizia: " + studentenMap.get("Patrizia"));

        System.out.println("Ist Sara vorhanden? " + studentenMap.containsKey("Sara"));
        System.out.println("Hat jemand 1.0 gehabt? " + studentenMap.containsValue(1.0f));

        Collection<Float> values = studentenMap.values();


        Iterator<String> it = studentenMap.keySet().iterator();
        System.out.println("Print with iterator");
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + " : " + studentenMap.get(key));
        }
        System.out.println("Print with enhanced for loop");
        for (String key : studentenMap.keySet()) {
            System.out.println(key + " : " + studentenMap.get(key));
        }

        System.out.println(values);

    }
}
