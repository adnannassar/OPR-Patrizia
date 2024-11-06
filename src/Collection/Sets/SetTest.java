package Collection.Sets;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("Patrizia", 1.3f));
        set.add(new Student("Mehmet", 2.0f));
        set.add(new Student("Sandra", 1.7f));
        set.add(new Student("Sandra", 1.7f));
        set.add(new Student("Klaus", 3.0f));
        set.add(new Student("Adnan", 3.3f));

        System.out.println(set);
    }

    static class Student {
        String name;
        float note;

        public Student(String name, float note) {
            this.name = name;
            this.note = note;
        }

        @Override
        public int hashCode() {
            return name.hashCode() + (int) note;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            if (this.name.equals(student.name) && this.note == student.note) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String toString() {
            return name + ", " + note;
        }
    }
}
