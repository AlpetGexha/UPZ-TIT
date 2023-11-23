package Test_1;

public class App1 {
    public static void main(String[] args) {

        Person p = new Person(
                "AB32",
                "Alpet",
                "Gexha",
                "08/05/2004"
        );

        Person pr = new Person(
                "AB32",
                "Rinesa",
                "Krasniqi",
                "27/09/2004"
        );

        System.out.println(p);
        System.out.println(p.getMosha());


        p.saveToFile();
        pr.saveToFile();

    }
}
