package Klausuren.ListenfilterFebruar2021_AndereLösung;

public class LaengerZehnFilter implements Filterkriterium {

    @Override
    public boolean kommtDurch(String element) {
        return element.length() > 10;
    }
}

