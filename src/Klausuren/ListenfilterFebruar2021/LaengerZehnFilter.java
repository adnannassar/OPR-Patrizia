package Klausuren.ListenfilterFebruar2021;

public class LaengerZehnFilter implements Filterkriterium {

    @Override
    public boolean kommtDurch(String element, int len) {
        return element.length() > 10;
    }
}

