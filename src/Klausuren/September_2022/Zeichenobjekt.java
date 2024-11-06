package Klausuren.September_2022;

public abstract class Zeichenobjekt {

    public abstract double fläche();

    public abstract double umfang();


    // Template Methode!
    public final String gibText() {
        return "F=<" + fläche() + ">, U=<" + umfang() + ">";
    }
}
