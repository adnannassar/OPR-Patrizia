package Comapring;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Bob", 21));
        list.add(new Student("Carlos", 20));
        list.add(new Student("Alex", 22));


        System.out.println("Before Sort: " + list);
        // sort nach age using Collections.sort with Comparable
        Collections.sort(list);
        System.out.println("After  Sort nach age: " + list);

        // sort nach name using Collections.sort with Comparator
        // Anonyme inline implementation

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println("After Sort nach name: " + list);


        // sort using list.sort
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println("After Sort nach age:  " + list);
    }
}
