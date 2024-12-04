package Aufzählungstypen.AnredeExample;

public enum Anrede {
    HERR("Herr"), FRAU("Frau");

    private String value;

    Anrede(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
