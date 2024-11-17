package Klausuren.September_2022.Aufgabe_001;

public class Kreis extends Zeichenobjekt {
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    @Override
    public double fläche() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double umfang() {
        return 2 * Math.PI * radius;
    }
}
