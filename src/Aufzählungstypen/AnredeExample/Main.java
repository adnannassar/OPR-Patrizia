package Aufzählungstypen.AnredeExample;

public class Main {
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter = new Mitarbeiter(
                "Max",
                "Mustermann",
                30,
                Anrede.HERR,
                new Adresse(
                        "Teststraße",
                        "1",
                        "12345",
                        "Teststadt"));

        System.out.println(mitarbeiter.getAnrede().getValue());
    }
}
