package Provimi_Janer_2024;

public class Employee extends Person {
    public int komunal_number;

    public Employee(String name, int age, int komunal_number) {
        super(name, age);
        this.komunal_number = komunal_number;
    }

    public int getKomunal_number() {
        return komunal_number;
    }

    public void setKomunal_number(int komunal_number) {
        this.komunal_number = komunal_number;
    }
}
