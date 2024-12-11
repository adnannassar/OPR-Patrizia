package Klausuren.ListenfilterFebruar2021_AndereLösung;

public class LaengerFilter implements Filterkriterium {

    private int length;

    public LaengerFilter(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean kommtDurch(String element) {
        return element.length() >= length;
    }
}

