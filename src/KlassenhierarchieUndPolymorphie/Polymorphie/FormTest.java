package KlassenhierarchieUndPolymorphie.Polymorphie;

public class FormTest {
    public static void main(String[] args) {
        Form form1 = new Square("yellow", 5);
        Form form2 = new Circle("black", 5);
        Form form3 = new Rectangle("white", 5, 10);

        Square square = new Square("red", 5);
        Circle circle = new Circle("blue", 5);
        Rectangle rectangle = new Rectangle("green", 5, 10);

        printFormInfo(square);
        printFormInfo(circle);
        printFormInfo(rectangle);
        printFormInfo(form1);
        printFormInfo(form2);
        printFormInfo(form3);
    }

    public static void printFormInfo(Form form) {
        System.out.println("Farbe: " + form.getColor() + ", Fläche: " + form.berechneFläche());
    }
}
