package Java_12_Polimorfizmi;

public class Manager extends Employee {

    private final double bonus;

    public Manager(String name, char gender, Date birthday, double salary, double b) {
        super(name, gender, birthday, salary);
        bonus = b;
    }

    public double getSalaryWithoutTax() {
        return super.getSalaryWithoutTax() + (bonus * salary);
    }

    public double getBonus() {
        return bonus;
    }

    public String toString() {
        return super.toString() + ", " + bonus;
    }
}

