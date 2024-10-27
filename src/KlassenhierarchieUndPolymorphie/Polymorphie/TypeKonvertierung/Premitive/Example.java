package KlassenhierarchieUndPolymorphie.Polymorphie.TypeKonvertierung.Premitive;

public class Example {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // implizite Typkonvertierung
        System.out.println(b); // 10.0

        int c = 20;
        byte d = (byte) c; // explizite Typkonvertierung
        System.out.println(d); // 10


        String number = "123abc";
        int e = Integer.parseInt(number); // explizite Typkonvertierung

        System.out.println(e + 5);
    }
}
