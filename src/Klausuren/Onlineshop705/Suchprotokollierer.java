package Klausuren.Onlineshop705;

import java.util.List;

public interface Suchprotokollierer {
    void protokolliere(String suchbegriff, List<Katalogartikel> treffer);
}
