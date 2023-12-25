package Java_12;

import java.util.ArrayList;

public class Company {

    private final String name;
    private final ArrayList<Employee> employees;

    public Company(String n) {
        name = n;
        employees = new ArrayList<>();
    }

    public boolean add(Employee e) {
        for (Employee e1 : employees) {
            if (e1.equals(e))
                return false;
        }
        employees.add(e);

        return true;
    }

    public void printWages() {
        for (Employee e : employees) {
            System.out.print("Salary: " + e.getSalaryWithoutTax());

            if (e instanceof Manager m) {
                System.out.print(", Bonus: " + m.getBonus());
            }

            System.out.println();
        }
    }

    public String getName() {
        return name;
    }
}