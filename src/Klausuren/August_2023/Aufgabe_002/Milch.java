package Klausuren.August_2023.Aufgabe_002;

public class Milch extends Lebensmittel {

    @Override
    public Zutat[] getZutaten() {
        Zutat[] zutaten = new Zutat[1];
        zutaten[0] = new Zutat("Milch", true);
        return zutaten;
    }

}
