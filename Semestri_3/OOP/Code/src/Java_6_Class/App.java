package Java_6_Class;

public class App {

    public static void main(String[] args) {
        LlogariaBankare l1 = new LlogariaBankare(
                "1234567890123456", "Besim Berisha", 456
        );

        System.out.println("Transferi: " + l1.transfer(175, "1231234564567890"));
        System.out.println("Deponimi: " + l1.deponim(850));
        System.out.println("Bilanci = " + l1.getBilanci());
        System.out.println("Terheqje: " + l1.terheqje(1000));

        l1.shikoBilancin();
        LlogariaBankare l2 = new LlogariaBankare("", "", 120);
    }
}