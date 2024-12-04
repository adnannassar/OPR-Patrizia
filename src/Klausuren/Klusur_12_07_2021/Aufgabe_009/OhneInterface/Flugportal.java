package Klausuren.Klusur_12_07_2021.Aufgabe_009.OhneInterface;

import java.util.ArrayList;
import java.util.List;

public class Flugportal {
    private List<Flug> flugs;

    public Flugportal() {
        this.flugs = new ArrayList<>();
    }

    public void addFlug(Flug flug) {
        flugs.add(flug);
    }

    /**
     * * Liefert alle Direktflüge vom Start- zum Zielflughafen
     */

    public List<Flug> sucheDirektfluege(String start, String ziel) {
        List<Flug> direkteVerbindungen = new ArrayList<>();
        for (Flug flug : flugs) {
            if (flug.start.equals(start) && flug.ziel.equals(ziel) && flug.IstDirektflug) {
                direkteVerbindungen.add(flug);
            }
        }
        return direkteVerbindungen;
    }

}
