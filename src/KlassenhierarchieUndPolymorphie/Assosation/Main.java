package KlassenhierarchieUndPolymorphie.Assosation;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Musterstraße", "1", "12345", "Dortmund", "Deutschland");

        Person person = new Person("Max", 30, address);

        person.addKontakt(new Kontakt("Email", "max@gmail.com"));
        person.addKontakt(new Kontakt("Handynummer", "123456123123"));
        person.addKontakt(new Kontakt("Handynummer", "019295819203"));


        System.out.println(person);

    }
}
