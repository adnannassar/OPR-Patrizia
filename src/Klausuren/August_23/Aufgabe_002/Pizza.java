package Klausuren.August_23.Aufgabe_002;

public class Pizza extends Lebensmittel {

    @Override
    public Zutat[] getZutaten() {
        Zutat[] zutaten = new Zutat[3];
        zutaten[0] = new Zutat("Mehl", true);
        zutaten[1] = new Zutat("Tomaten", true);
        zutaten[2] = new Zutat("Käse", true);

        return zutaten;
    }
}
