package Klausuren.Klusur_12_07_2021.Aufgabe_009.MitInterface;

public class DortmundFilter implements Protokollierer{

    @Override
    public boolean filter(String start, String ziel, boolean direktflug) {
        return start.equals("Dortmund") && ziel.equals("Essen");
    }
}
