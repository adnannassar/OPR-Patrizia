package KlassenhierarchieUndPolymorphie.Assosation;

public class Address {
    private String straße;
    private String hausnummer;
    private String plz;
    private String ort;
    private String land;

    public Address(String straße, String hausnummer, String plz, String ort, String land) {
        this.straße = straße;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
        this.land = land;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    @Override
    public String toString() {
        return "Address: " + straße + " " + hausnummer + ", " + plz + " " + ort + ", " + land;
    }
}
