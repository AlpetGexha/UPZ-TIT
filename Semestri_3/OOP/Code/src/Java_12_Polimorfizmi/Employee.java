package Java_12_Polimorfizmi;

public class Employee extends Person {

    private static long num = 0;
    protected long id;
    protected double salary, tax;

    public Employee(String name, char gender, Date birthday, double s) {
        super(name, gender, birthday);
        salary = s;
        num++;
        id = num;
        //ose
        //id = ++num;
        if (salary < 450)
            tax = 0.1;
        else if (salary >= 450 && salary < 600)
            tax = 0.2;
        else
            tax = 0.3;
    }

    public double getSalaryWithoutTax() {
        return salary - (salary * tax);
    }

    public long getId() {
        return id;
    }

    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (o instanceof Employee e)
            return this.id == e.getId();

        return false;
    }

    public String toString() {
        return id + ", " + super.toString() + ", " + salary;
    }
}