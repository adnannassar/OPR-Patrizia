package Collection.TypeParameter;

import KlassenhierarchieUndPolymorphie.AbstractClass.Circle;
import KlassenhierarchieUndPolymorphie.AbstractClass.Form;
import KlassenhierarchieUndPolymorphie.AbstractClass.Rectangle;
import KlassenhierarchieUndPolymorphie.AbstractClass.Square;

import java.util.LinkedList;

public class TypeParameterTest {
    public static void main(String[] args) {
        LinkedList<Form> list = new LinkedList<>();

        list.add(new Rectangle("Red", 20, 30));
        list.add(new Circle("Blue", 10));
        list.add(new Square("Green", 15));

        System.out.println(list);
    }
}
