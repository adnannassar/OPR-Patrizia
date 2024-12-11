package Klausuren.Onlineshop705;

import java.util.ArrayList;
import java.util.List;

public class Katalog {
    private List<Katalogartikel> artikels;

    public Katalog() {
        artikels = new ArrayList<>();
    }

    public List<Katalogartikel> suche(String text) {
        return artikels;
    }

    public void add(Katalogartikel katalogartikel) {
        artikels.add(katalogartikel);
    }


}
