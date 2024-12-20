package Klausuren.August_2023.Aufgabe_008.Aufgabe_a;


public class Konto {
    private float kontostand;
    private boolean isPrivatkonto;

    public Konto(float kontostand, boolean isPrivatkonto) {
        this.kontostand = kontostand;
        this.isPrivatkonto = isPrivatkonto;
    }

    public float getKontostand() {
        return kontostand;
    }

    public boolean isPrivatkonto() {
        return isPrivatkonto;
    }
}
