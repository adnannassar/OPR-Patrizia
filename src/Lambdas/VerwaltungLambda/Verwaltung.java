package Lambdas.VerwaltungLambda;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.SortedMap;
import java.util.function.Consumer;

public class Verwaltung {
    private LinkedList<Employee> employees;

    public Verwaltung() {
        this.employees = new LinkedList<>();
    }

    public void add(Employee employee) {
        this.employees.add(employee);
    }

    public void printAllEmployees() {
        employees.forEach((e) -> System.out.println(e));
    }

    public void sortByVorname() {
        employees.sort((e1, e2) -> e1.getVorname().compareTo(e2.getVorname()));
    }

    @FunctionalInterface
    public interface FilterEmployee {
        boolean test(Employee e);
    }

    public void printAllEmployeesStartWithLetter(FilterEmployee filter) {
        if (employees.isEmpty()) {
            System.out.println("No Employees!");
        } else {
            for (Employee e : employees) {
                if (filter.test(e)) {
                    System.out.println(e);
                }
            }
        }
    }
}
