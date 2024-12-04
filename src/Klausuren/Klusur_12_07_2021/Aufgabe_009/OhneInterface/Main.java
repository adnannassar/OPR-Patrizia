package Klausuren.Klusur_12_07_2021.Aufgabe_009.OhneInterface;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Flugportal flugportal = new Flugportal();

        flugportal.addFlug(new Flug("Berlin", "Hamburg", 150.0, true, "127", "Lufthansa"));
        flugportal.addFlug(new Flug("München", "Frankfurt", 350.0, false, "128", "Air France"));
        flugportal.addFlug(new Flug("Stuttgart", "Köln", 250.0, true, "129", "Lufthansa"));
        flugportal.addFlug(new Flug("Hamburg", "Berlin", 180.0, false, "130", "Fly Emirates"));
        flugportal.addFlug(new Flug("Berlin", "Köln", 220.0, true, "131", "Lufthansa"));
        flugportal.addFlug(new Flug("München", "Stuttgart", 320.0, false, "132", "Qatar Airways"));
        flugportal.addFlug(new Flug("Berlin", "Hamburg", 400.0, true, "133", "British Airways"));
        flugportal.addFlug(new Flug("Berlin", "Frankfurt", 170.0, false, "134", "Air France"));
        flugportal.addFlug(new Flug("Köln", "München", 290.0, true, "135", "Lufthansa"));
        flugportal.addFlug(new Flug("Stuttgart", "Hamburg", 310.0, false, "136", "Fly Emirates"));
        flugportal.addFlug(new Flug("Hamburg", "Köln", 200.0, false, "137", "Qatar Airways"));
        flugportal.addFlug(new Flug("Berlin", "Düsseldorf", 330.0, true, "138", "British Airways"));
        flugportal.addFlug(new Flug("Frankfurt", "Stuttgart", 280.0, false, "139", "Fly Emirates"));
        flugportal.addFlug(new Flug("Köln", "Frankfurt", 260.0, true, "140", "Air France"));
        flugportal.addFlug(new Flug("Hamburg", "Düsseldorf", 190.0, false, "141", "Lufthansa"));

        List<Flug> direktfluege = flugportal.sucheDirektfluege("Berlin", "Hamburg");
        for(Flug f: direktfluege){
            System.out.println(f);
        }

    }
}
