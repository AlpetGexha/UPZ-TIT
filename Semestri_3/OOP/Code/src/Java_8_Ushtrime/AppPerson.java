package Java_8_Ushtrime;

public class AppPerson {

    public static void main(String[] args) {
        Person P = new Person(
                "12345", "Filan", "Fisteku", "09/01/1996"
        );
        System.out.println(P); //toString()

        P.shtypTeDhenat();
        System.out.println("Mosha: " + P.getMosha());
    }
}