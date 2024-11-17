package Klausuren.September_2022.Aufgabe_004;

import java.util.Objects;

public class Rechteck {
    private int breite;
    private int laenge;

    public Rechteck(int breite, int laenge) throws IllegalArgumentException {
        if (breite <= 0 || laenge <= 0) {
            throw new IllegalArgumentException("Breite und Laenge muessen groesser als 0 sein");
        }else{
            this.breite = breite;
            this.laenge = laenge;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rechteck rechteck = (Rechteck) o;
        return breite == rechteck.breite && laenge == rechteck.laenge;
    }

    @Override
    public int hashCode() {
        return Objects.hash(breite, laenge);
    }

    @Override
    public String toString() {
        return "Rechteck{" +
                "breite=" + breite +
                ", laenge=" + laenge +
                '}';
    }
}