package KlassenhierarchieUndPolymorphie.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Square square = new Square("Red", 4);
        Rectangle rectangle = new Rectangle("Blue", 2, 5);
        Circle circle = new Circle("Black", 1);


        FormVerwaltung formVerwaltung = new FormVerwaltung();
        formVerwaltung.addForm(square);
        formVerwaltung.addForm(rectangle);
        formVerwaltung.addForm(circle);

        formVerwaltung.printFormen();
    }
}
