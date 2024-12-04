package Klausuren.Klusur_12_07_2021.Aufgabe_009.MitInterface;

public class Flug {
    String start;
    String ziel;
    double price;
    boolean IstDirektflug;
    String flugnummer;
    String company;

    public Flug(String start, String ziel, double price, boolean direktflug, String flugnummer, String company) {
        this.start = start;
        this.ziel = ziel;
        this.price = price;
        this.IstDirektflug = direktflug;
        this.flugnummer = flugnummer;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Flug{" +
                "start='" + start + '\'' +
                ", ziel='" + ziel + '\'' +
                ", price=" + price +
                ", direktflug=" + IstDirektflug +
                ", flugnummer='" + flugnummer + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

}
