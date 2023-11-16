package Java_7;

public class App {
    public static void main(String[] args) {
        Libri lib =  new Libri(
                "Darka e gabuar",
                "Ismail Filan Kadare",
                "Rilindja",
                "Roman",
                356
        );

        lib.shtypTeDhenate();

        System.out.println("Cmimi: " + lib.llogartiCmimin() + " euro");
        System.out.println("Inicialet e autorit: " + lib.inicialet());
    }
}
