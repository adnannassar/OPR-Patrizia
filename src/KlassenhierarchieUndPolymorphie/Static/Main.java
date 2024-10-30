package KlassenhierarchieUndPolymorphie.Static;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.test = 10;
        a.methode1();

        A.test1 = 30;
        A.methode2();

        A a1 = new A();
        a1.test = 20;


        System.out.println(a.test); // 10
        System.out.println(a1.test); // 20


        System.out.println(a.test1); // 30
        System.out.println(a1.test1); // 30

    }


}
