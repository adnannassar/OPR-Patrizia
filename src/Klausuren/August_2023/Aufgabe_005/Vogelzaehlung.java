package Klausuren.August_2023.Aufgabe_005;


import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Ein Objekt dieser Klasse dient dazu, die Anzahl Exemplare von Vögeln zu zählen
 */
public class Vogelzaehlung {

    private static Map<String, Integer> vogelMap = new TreeMap<>();

    public static void main(String[] args) {

        addVogel("Blaumeise", 5);
        addVogel("Blaumeise", 100);
        addVogel("Amsel", 10);
        addVogel("Amsel", 10);
        addVogel("Buchfink", 30);

        Collection<String> names = alleVoegel();
        System.out.println("Vogel Names: " + names);

        System.out.println("Anzahl von Blaumeise: " + anzahl("Blaumeise"));
        System.out.println("Anzahl von Amsel: " + anzahl("Amsel"));
        System.out.println("Anzahl von Buchfink: " + anzahl("Buchfink"));

    }

    /**
     * Es wird eine Anzahl an Exemplaren eines Vogels gezählt.
     * Gibt es bereits einen Zählwert für diesen Vogel, wird dieser Wert um die Anzahl erhöht.
     *
     * @param vogelName Vogel, der gezählt wird
     * @param anzahl    ist Anzahl Exemplare des Vogels; es wird davon ausgegangen, dass die Anzahl größer als 0
     */
    public static void addVogel(String vogelName, int anzahl) {
        boolean isKeyVorhanden = vogelMap.containsKey(vogelName);
        if (isKeyVorhanden) {
            int alteAnzahl = vogelMap.get(vogelName);
            anzahl += alteAnzahl;
        }
        vogelMap.put(vogelName, anzahl);
    }

    /**
     * Liefert alle Vögel, die gezählt wurden
     *
     * @return alle Vögel als Collection; bei einer Iteration über die Collection sollen die Vögel in
     * alphabetischer Reihenfolge durchlaufen werden
     */
    public static Collection<String> alleVoegel() {
        return vogelMap.keySet();
    }

    /**
     * Liefert den Zählwert für einen Vogel.
     *
     * @param vogel ist ein Vogel, für den der Zählwert geliefert wird
     * @return Zählwert für den Vogel oder 0, wenn Vogel bisher nicht gezählt wurde
     */
    public static int anzahl(String vogel) {
        int anzahl = vogelMap.get(vogel);
        return anzahl;
    }
}
