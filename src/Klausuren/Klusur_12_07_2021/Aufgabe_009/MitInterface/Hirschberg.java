package Klausuren.Klusur_12_07_2021.Aufgabe_009.MitInterface;

public class Hirschberg implements Protokollierer {

    @Override
    public boolean filter(String start, String ziel, boolean direktflug) {
        if (ziel.equals("Hirschberg")) {
            return true;
        } else {
            return false;
        }
    }
}
