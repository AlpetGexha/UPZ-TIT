package Java_12;

public class App {

    public static void main(String[] args) {
        Employee e1 = new Employee(
                "Filan Fisteku",
                'M',
                new Date(19, 2, 2001),
                556
        );

        Employee e2 = new Employee(
                "Test Testi",
                'M',
                new Date(19, 2, 2001),
                670
        );

        Manager m1 = new Manager(
                "Filane Fisteku",
                'F',
                new Date(15, 1, 1998),
                810,
                0.15
        );

        Company c1 = new Company("VIVA");
        c1.add(e1);
        c1.add(e1); //false
        c1.add(e2);
        c1.add(m1);
        c1.printWages();
    }
}