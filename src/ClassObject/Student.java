package ClassObject;


public class Student {
    private String name;
    private int age;

    @Override
    public int hashCode() {
        return name.hashCode() + age;
       //  return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Student s = (Student) o;
        if (this.age == s.age && this.name.equals(s.name)) {
            return true;
        } else {
            return false;
        }
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
