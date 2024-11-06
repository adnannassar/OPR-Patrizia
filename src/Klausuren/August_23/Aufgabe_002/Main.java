package Klausuren.August_23.Aufgabe_002;

public class Main {
    public static void main(String[] args) {

        Lebensmittel lb1 = new Pizza();
        Lebensmittel lb2 = new Burger();
        Lebensmittel lb3 = new Milch();


        System.out.println(lb1.zutatentext());
        if (lb1.istVegan()) {
            System.out.println("Pizza ist vegan");
        } else {
            System.out.println("Pizza ist nicht vegan");

        }


        System.out.println(lb2.zutatentext());
        if (lb2.istVegan()) {
            System.out.println("Burger ist vegan");
        } else {
            System.out.println("Burger ist nicht vegan");
        }

        System.out.println(lb3.zutatentext());
        if (lb3.istVegan()) {
            System.out.println("Milch ist vegan");
        } else {
            System.out.println("Milch ist nicht vegan");
        }
    }
}
