package Klausuren.Januar_2024.Aufgabe_007.Aufgabe_a;

public class Rechteck {
    private float länge;
    private float breite;

    public Rechteck(float länge, float breite) {
        this.länge = länge;
        this.breite = breite;
    }

    public boolean istQuadratisch() {
        return länge == breite;
    }

    public float fläche() {
        return länge * breite;
    }
}
