package Lambdas.VerwaltungLambda;

public class Main {

    public static void main(String[] args) {
        Verwaltung verwaltung = new Verwaltung();
        verwaltung.add(new Employee("Esraa", "Alawad", 20));
        verwaltung.add(new Employee("Mariam", "Alaoirafli", 15));
        verwaltung.add(new Employee("Nesriin", "Basha", 30));
        verwaltung.add(new Employee("Adnan", "Nassar", 35));


        System.out.println("Before Sort!");
        verwaltung.printAllEmployees();

        System.out.println();

        verwaltung.sortByVorname();
        System.out.println("After Sort!");
        verwaltung.printAllEmployees();

        System.out.println("\nEmployees with Vorname starting with 'A'");
        verwaltung.printAllEmployeesStartWithLetter((e) -> e.getVorname().startsWith("A"));
    }
}
