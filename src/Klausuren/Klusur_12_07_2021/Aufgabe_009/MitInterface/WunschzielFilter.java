package Klausuren.Klusur_12_07_2021.Aufgabe_009.MitInterface;

public class WunschzielFilter implements Protokollierer{

    private String wunschzielOrt;

    public WunschzielFilter(String wunschzielOrt) {
        this.wunschzielOrt = wunschzielOrt;
    }

    @Override
    public boolean filter(String start, String ziel, boolean direktflug) {
        return ziel.equals(wunschzielOrt);
    }
}
