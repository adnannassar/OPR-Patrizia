package Klausuren.September_2022.Aufgabe_001;

public class Rechteck extends Zeichenobjekt {
    private double a;
    private double b;

    public Rechteck(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double fläche() {
        return a * b;
    }

    @Override
    public double umfang() {
        return 2 * a + 2 * b;
    }
}
