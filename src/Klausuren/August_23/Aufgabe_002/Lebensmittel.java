package Klausuren.August_23.Aufgabe_002;

public abstract class Lebensmittel {

    public abstract Zutat[] getZutaten();

    public final String zutatentext() {
        Zutat[] zutaten = getZutaten();
        String erg = "";
        if (zutaten != null) {
            if (zutaten.length == 1) {
                erg += "Zutat: " + zutaten[0].getName();
            } else {
                erg += "Zutaten: ";
                for (int i = 0; i < zutaten.length; i++) {
                    if (i == zutaten.length - 1) {
                        erg += zutaten[i].getName();
                    } else {
                        erg += zutaten[i].getName() + ", ";
                    }
                }
            }
        }
        return erg;
    }

    public final boolean istVegan() {
        Zutat[] zutaten = getZutaten();
        if (zutaten != null) {
            for (int i = 0; i < zutaten.length; i++) {
                if (!zutaten[i].istVegan()) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
