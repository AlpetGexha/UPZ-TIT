package Detyra_Orkestra;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Dirigjent dirigjent = new Dirigjent(
                "Mejshtri",
                45,
                "Maestro"
        );

        Muzikant muzikant1 = new Muzikant("Muzikanti1", 25, "Violina");
        Muzikant muzikant2 = new Muzikant("Muzikanti2", 27, "Piano");


        ArrayList<Muzikant> muzikantet = new ArrayList<Muzikant>();
        muzikantet.add(muzikant1);
        muzikantet.add(muzikant2);

        Orkestra orkestra = new Orkestra(
                "Orkestra e Pergjithme",
                dirigjent,
                muzikantet
        );


        System.out.println(orkestra);

        orkestra.save2File();

        Orkestra orkestra2 = Orkestra.loadFromFile("src/Detyra_Orkestra/load.txt");

        System.out.println(orkestra2);
    }
}

