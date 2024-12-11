package Klausuren.Onlineshop705;


//7.05 REKO

import java.util.List;

public class Onlineshop {
    private Katalog katalog;
    private Suchprotokollierer suchprotokollierer;

    public Onlineshop(Suchprotokollierer suchprotokollierer) {
        this.suchprotokollierer = suchprotokollierer;
        katalog = new Katalog();

    }

    public void add(Katalogartikel katalogartikel) {
        katalog.add(katalogartikel);
    }

    /*
     *Sucht im katalog nach Artikeln, die zu dem Suchbegriff passen.
     */
    public List<Katalogartikel> suche(String suchbegriff) {
        List<Katalogartikel> treffer = katalog.suche(suchbegriff);
        suchprotokollierer.protokolliere(suchbegriff, treffer);

        return treffer;
    }

    public static void main(String[] args) {
        //System.out.println("huhu");

        KeineTreffer keineTrefferProtokoll = new KeineTreffer();

        Onlineshop shop = new Onlineshop(keineTrefferProtokoll);

        shop.add(new Katalogartikel("dziweczka"));
        shop.add(new Katalogartikel("do"));
        shop.add(new Katalogartikel("laseczka"));
        shop.add(new Katalogartikel("do"));
        shop.add(new Katalogartikel("zielonego"));
        shop.add(new Katalogartikel("a ha"));
        shop.add(new Katalogartikel("huhu"));

        shop.suche("huhu");
        shop.suche("do");
        shop.suche("zielonego");
        shop.suche("a ha");
        shop.suche("huhu");
        shop.suche("Test");

        System.out.println("Zu diesen Suchbegriffen wurde nichts gefunden: " + keineTrefferProtokoll.gibBegriffeOhneTreffer());
    }
}

