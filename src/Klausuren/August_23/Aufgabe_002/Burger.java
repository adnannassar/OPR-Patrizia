package Klausuren.August_23.Aufgabe_002;

public class Burger extends Lebensmittel {

    @Override
    public Zutat[] getZutaten() {
        Zutat[] zutaten = new Zutat[3];
        zutaten[0] = new Zutat("Brötchen", true);
        zutaten[1] = new Zutat("Fleisch", false);
        zutaten[2] = new Zutat("Salat", true);

        return zutaten;
    }

}
