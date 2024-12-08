package Klausuren.Klusur_12_07_2021.Aufgabe_009.MitInterface;

import java.util.ArrayList;
import java.util.List;

public class Flugportal {
    private List<Flug> flüge;
    private Protokollierer protokollierer; // null

    public Flugportal() {
        this.flüge = new ArrayList<>();
    }

    public void setProtokollierer(Protokollierer protokollierer) {
        this.protokollierer = protokollierer;
    }

    public void addFlug(Flug flug) {
        flüge.add(flug);
    }

    public List<Flug> sucheDirektfluege(String start, String ziel) {
        List<Flug> verbindungen = new ArrayList<>();
        for (Flug flug : flüge) {
            if (this.protokollierer.filter(flug.start, flug.ziel, flug.IstDirektflug)) {
                verbindungen.add(flug);
            }
        }
        return verbindungen;
    }
}
