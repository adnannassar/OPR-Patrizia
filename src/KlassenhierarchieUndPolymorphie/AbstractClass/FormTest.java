package KlassenhierarchieUndPolymorphie.AbstractClass;

public class FormTest {
    public static void main(String[] args) {
        Square square = new Square("red", 5);
        Circle circle = new Circle("blue", 5);
        Rectangle rectangle = new Rectangle("green", 5, 10);

        System.out.println("Square: " + square.berechneFläche());
        System.out.println("Circle: " + circle.berechneFläche());
        System.out.println("Rectangle: " + rectangle.berechneFläche());
    }
}
