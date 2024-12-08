package AnonymClass;

public abstract class Form {
    String color = "Red";

    public abstract double berechneFlaeche();

    @Override
    public String toString() {
        return "Color: " + color;
    }
}
