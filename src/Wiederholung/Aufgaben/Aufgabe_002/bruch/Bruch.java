package Wiederholung.Aufgaben.Aufgabe_002.bruch;

import Pakete.Paket2.B;

public class Bruch {
    private int zaehler;
    private int nenner;

    public Bruch() { //Konstruktor
        this.zaehler = 1;
        this.nenner = 1;
    }

    public Bruch(int zaehler, int nenner) { //Konstruktor
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public int getZaehler() { //Getter Methode
        return zaehler;
    }

    public int getNenner() { //Getter Methode
        return nenner;
    }

    public Bruch kehrwert() {
        return new Bruch(this.nenner, this.zaehler);
    }

    public Bruch addieren(Bruch b) {
        int nenner2 = 1;
        int zaehler2 = 1;
        int ergebnisZaehler = 0;
        int ergebnisNenner = 0;
        if (nenner == nenner2) {
            ergebnisZaehler = zaehler + zaehler2;
            ergebnisNenner = nenner;
            System.out.println("Zaehler: " + ergebnisZaehler + " Nenner: " + ergebnisNenner);
        } else {
            return null;
        }
        return null;
    }


    public Bruch multiplizieren(Bruch c) {
        int ergebnisZaehler = this.zaehler * c.zaehler;
        int ergebnisNenner = this.nenner * c.nenner;

        Bruch ergebnis = new Bruch(ergebnisZaehler, ergebnisNenner);
        return ergebnis;
    }

}

