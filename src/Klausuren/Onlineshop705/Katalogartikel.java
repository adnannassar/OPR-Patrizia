package Klausuren.Onlineshop705;

import java.util.Objects;

public class Katalogartikel {

    private String name;

    public Katalogartikel(String name) {
        this.name = name;
    }


    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Katalogartikel that = (Katalogartikel) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
