package Wiederholung.Aufgaben.Aufgabe_001;

public class DosenRechner {
    public static void main(String[] args){
        // pi = 3.14159265;
        System.out.println("Der Umfang der Dose ist " +  berechneUmfang(2, 3.5));
        System.out.println("Die Deckenfläche der Dose ist " + berechneDeckelflaeche(2.5));
        System.out.println("Die Mantelfläche der Dose ist " + berechneMantenflaeche(30, 40));
        System.out.println("Die Oberfläche der Dose ist " + berechneOberflaeche(2));
        System.out.println("Das Volumen der Dose ist " + berechneVolumen(3));
    }
    public static double berechneUmfang(int zahl, double radius){
        return zahl * Math.PI * radius;
    }
    public static double berechneDeckelflaeche(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    public static int berechneMantenflaeche(int umfang, int hoehe){
        return umfang * hoehe;
    }
    public static double berechneOberflaeche(int zahl){
        return zahl * berechneDeckelflaeche(2.5) * berechneMantenflaeche(30,40);
    }
    public static double berechneVolumen(int hoehe){
        return berechneDeckelflaeche(2.5) * hoehe;
    }
}
