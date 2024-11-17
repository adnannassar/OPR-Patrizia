package Klausuren.August_2023.Aufgabe_002;

public class Zutat {
    private String name;
    private boolean istVegan;

    public Zutat(String name, boolean istVegan) {
        this.name = name;
        this.istVegan = istVegan;
    }

    public final String getName() {
        return this.name;
    }

    public boolean istVegan() {
        return istVegan;
    }
}

