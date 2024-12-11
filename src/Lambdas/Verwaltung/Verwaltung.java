package Lambdas.Verwaltung;

import java.util.LinkedList;

public class Verwaltung {
    private LinkedList<Employee> employees;

    public Verwaltung() {
        this.employees = new LinkedList<>();
    }

    public void add(Employee employee) {
        this.employees.add(employee);
    }

    public void printAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No Employees!");
        } else {
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }

    public void sortByVorname() {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size() - 1; j++) {
                if (employees.get(j).getVorname().compareTo(employees.get(j + 1).getVorname()) > 0) {
                    Employee temp = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, temp);
                }
            }
        }
    }

    public void printAllEmployeesStartWithLetter(String letter) {
        if(employees.isEmpty()){
            System.out.println("No Employees!");
        }else {
            for (Employee e : employees) {
                if (e.getVorname().startsWith(letter)) {
                    System.out.println(e);
                }
            }
        }
    }
}
