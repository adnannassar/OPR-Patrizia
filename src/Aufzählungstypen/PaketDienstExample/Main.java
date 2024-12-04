package Aufzählungstypen.PaketDienstExample;

public class Main {
    public static void main(String[] args) {
        sendPaket(1);
        sendPaket(3);
        sendPaket(6);
        sendPaket(11);
        sendPaket(26);
    }

    private static void sendPaket(double gewicht) {
        if (Paket.S.getMaxGewicht() >= gewicht) {
            System.out.println("Das Paket passt mit dem Gewicht " + gewicht + " passt in S");
        } else if (Paket.M.getMaxGewicht() >= gewicht) {
            System.out.println("Das Paket passt mit dem Gewicht " + gewicht + " passt in M");
        } else if (Paket.L.getMaxGewicht() >= gewicht) {
            System.out.println("Das Paket passt mit dem Gewicht " + gewicht + " passt in L");
        } else if (Paket.XL.getMaxGewicht() >= gewicht) {
            System.out.println("Das Paket passt mit dem Gewicht " + gewicht + " passt in XL");
        } else {
            System.out.println("Das Paket  mit dem Gewicht gewicht " + gewicht + " ist zu groß");
        }
    }
}
