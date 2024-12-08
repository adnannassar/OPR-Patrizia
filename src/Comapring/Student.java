package Comapring;

public class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + age + ")";
    }
}
