package Klausuren.Januar_2024.Aufgabe_008.Lamba;

public class Main {
    public static void main(String[] args) {
        OnlineBanking onlineBanking = new OnlineBanking();

        onlineBanking.setzePINregel(pin -> pin.length() >= 5 && pin.charAt(0) != pin.charAt(pin.length() - 1));
        onlineBanking.setzePINregel(pin -> false);
    }
}
