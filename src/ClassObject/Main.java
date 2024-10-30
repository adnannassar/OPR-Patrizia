package ClassObject;

public class Main {
    public static void main(String[] args) {
        String name =  "Ibrahim";
        String name2 = "Ibrahim";

        Student student =  new Student("Adnan", 30);
        Student student2 = new Student("Adnan", 30);

        // 1. getClass() method is used to get the runtime class of an object.
        System.out.println(name.getClass());
        System.out.println(student.getClass());


        // 2. hashCode() method is used to get the hash code of an object.
        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());


        // 3. equals() method is used to compare the equality of two objects.
        System.out.println(name.equals(name2));
        System.out.println(student.equals(student2));


        if(student instanceof Student){
            System.out.println("Student is an instance of Student");
        }

    }
}
