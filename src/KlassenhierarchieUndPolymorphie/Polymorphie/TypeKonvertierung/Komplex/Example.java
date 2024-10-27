package KlassenhierarchieUndPolymorphie.Polymorphie.TypeKonvertierung.Komplex;

import KlassenhierarchieUndPolymorphie.Polymorphie.Circle;
import KlassenhierarchieUndPolymorphie.Polymorphie.Form;
import KlassenhierarchieUndPolymorphie.Polymorphie.Square;

public class Example {
    public static void main(String[] args) {
        Circle circle = new Circle("blue", 5);

        Form form = circle;

        Square square = (Square) form;
    }
}
