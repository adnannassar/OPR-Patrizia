package Aufzählungstypen.AnredeExample;

public class Mitarbeiter {
    private String vorname;
    private String nachname;
    private int alter;
    private Anrede anrede;
    private Adresse adresse;

    public Mitarbeiter(String vorname, String nachname, int alter, Anrede anrede, Adresse adresse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.anrede = anrede;
        this.adresse = adresse;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }


    public Anrede getAnrede() {
        return anrede;
    }

    public void setAnrede(Anrede anrede) {
        this.anrede = anrede;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", alter=" + alter +
                ", anrede='" + anrede + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
