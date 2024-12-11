package Klausuren.ListenfilterFebruar2021;

public class LaengerFilter implements Filterkriterium {

    private int length;

    public LaengerFilter(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean kommtDurch(String element, int len) {
        return element.length() >= len;
    }
}

