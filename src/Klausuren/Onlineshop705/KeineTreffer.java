package Klausuren.Onlineshop705;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeineTreffer implements Suchprotokollierer {

    private Set<String> begriffeOhneTreffer = new HashSet<>();

    public Set<String> gibBegriffeOhneTreffer() {
        return begriffeOhneTreffer;
    }

    @Override
    public void protokolliere(String suchbegriff, List<Katalogartikel> treffer) {
        if (!treffer.isEmpty() && !treffer.contains(new Katalogartikel(suchbegriff))) {
            begriffeOhneTreffer.add(suchbegriff);
        }
    }

}
