package Klausuren.Klusur_12_07_2021.Aufgabe_009.MitInterface;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Hirschberg hirschbergFilter = new Hirschberg();

        DortmundFilter dortmudFilter = new DortmundFilter();


        WunschzielFilter wunschzielFilter = new WunschzielFilter("Köln");
        //TODO
        // PriseFilter priseFilter = new PriseFilter(200.0, 300.0);
        // PriseAndDWünschziel priseAndDWünschziel = new PriseAndDWünschziel(200.0, 300.0, start, ziel);

        Flugportal flugportal = new Flugportal();
        flugportal.setProtokollierer(wunschzielFilter);


        flugportal.addFlug(new Flug("Berlin", "Hirschberg", 150.0, false, "127", "Lufthansa"));
        flugportal.addFlug(new Flug("München", "Frankfurt", 350.0, false, "128", "Air France"));
        flugportal.addFlug(new Flug("Stuttgart", "Köln", 250.0, true, "129", "Lufthansa"));
        flugportal.addFlug(new Flug("Dortmund", "Berlin", 180.0, false, "130", "Fly Emirates"));
        flugportal.addFlug(new Flug("Berlin", "Köln", 220.0, true, "131", "Lufthansa"));
        flugportal.addFlug(new Flug("München", "Stuttgart", 320.0, false, "132", "Qatar Airways"));
        flugportal.addFlug(new Flug("Frankfurt", "Berlin", 400.0, true, "133", "British Airways"));
        flugportal.addFlug(new Flug("Berlin", "Frankfurt", 170.0, false, "134", "Air France"));
        flugportal.addFlug(new Flug("Köln", "München", 290.0, true, "135", "Lufthansa"));
        flugportal.addFlug(new Flug("Stuttgart", "Hamburg", 310.0, false, "136", "Fly Emirates"));
        flugportal.addFlug(new Flug("Dortmund", "Köln", 200.0, false, "137", "Qatar Airways"));
        flugportal.addFlug(new Flug("Berlin", "Düsseldorf", 330.0, true, "138", "British Airways"));
        flugportal.addFlug(new Flug("Frankfurt", "Stuttgart", 280.0, false, "139", "Fly Emirates"));
        flugportal.addFlug(new Flug("Köln", "Frankfurt", 260.0, true, "140", "Air France"));
        flugportal.addFlug(new Flug("Hamburg", "Düsseldorf", 190.0, false, "141", "Lufthansa"));


        //TODO
        // Alle Flüge müsse nach preis aufsteigend sortiert werden

        List<Flug> fluege = flugportal.sucheDirektfluege("Stuttgart", "Hirschberg");

        if (fluege.isEmpty()) {
            System.out.println("Keine Flüge gefunden von " + "Stuttgart" + " nach " + "Köln");
        } else {
            for (Flug f : fluege) {
                System.out.println(f);
            }
        }
    }
}