package Aufzählungstypen.WochentagExample;

public class Main {
    public static void main(String[] args) {

        if (Wochentag.SONNTAG.istWochenende()) {
            System.out.println("ist Wochenende");
        } else {
            System.out.println("ist kein Wochenende");
        }

        if (Wochentag.FREITAG.ordinal() > Wochentag.DONNERSTAG.ordinal()) {
            System.out.println("Freitag ist nach Donnerstag");
        }

        if (Wochentag.SONNTAG.naechsterTag().equals(Wochentag.MONTAG)) {
            System.out.println("Montag ist nach Sonntag");
        }else{
            System.out.println("Montag ist nicht nach Sonntag");
        }
    }
}
