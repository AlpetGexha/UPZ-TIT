package Detyra_Orkestra;

import java.io.*;
import java.util.ArrayList;

public class Orkestra {

    private String emri;
    private Dirigjent dirigjent;
    private ArrayList<Muzikant> muzikantet;

    public Orkestra(String emri, Dirigjent dirigjent, ArrayList<Muzikant> muzikantet) {
        this.emri = emri;
        this.dirigjent = dirigjent;
        this.muzikantet = muzikantet;
    }


    public static Orkestra loadFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String emri = null;
            Dirigjent dirigjent = null;
            ArrayList<Muzikant> muzikantet = new ArrayList<>();

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Orkestra:")) {
                    emri = line.substring("Orkestra: ".length());
                } else if (line.startsWith("Dirigjent:")) {
                    String dirigjentInfo = line.substring("Dirigjent: ".length());
                    dirigjent = parseDirigjent(dirigjentInfo);
                } else if (line.startsWith("Muzikantet:")) {
                    String muzikantInfo = line.substring("Muzikantet: ".length());
                    muzikantet = parseMuzikantet(muzikantInfo);
                }
            }

            return new Orkestra(emri, dirigjent, muzikantet);

        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private static Dirigjent parseDirigjent(String dirigjentInfo) {
        String[] parts = dirigjentInfo.split(", ");
        String titulli = parts[0].substring("Titulli: ".length());
        String personInfo = parts[1].substring("Person: ".length());
        String[] personParts = personInfo.split(" ");
        String emri = personParts[0];
        int mosha = Integer.parseInt(personParts[1]);

        return new Dirigjent(emri, mosha, titulli);
    }

    private static ArrayList<Muzikant> parseMuzikantet(String muzikantInfo) {
        String[] muzikantParts = muzikantInfo.split(", ");
        ArrayList<Muzikant> muzikantet = new ArrayList<>();

        for (String muzikantPart : muzikantParts) {
//            Instrumenti: Piano Person: Muzikanti2 27
            String instrumenti = muzikantPart.substring("Instrumenti: ".length(), muzikantPart.indexOf("Person: "));
            String personInfo = muzikantPart.substring(muzikantPart.indexOf("Person: ") + "Person: ".length());
            String[] personParts = personInfo.split(" ");
            String emri = personParts[0];
            int mosha = Integer.parseInt(personParts[1]);

            muzikantet.add(new Muzikant(emri, mosha, instrumenti));
        }

        return muzikantet;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public Dirigjent getDirigjent() {
        return dirigjent;
    }

    public void setDirigjent(Dirigjent dirigjent) {
        this.dirigjent = dirigjent;
    }

    public ArrayList<Muzikant> getMuzikantet() {
        return muzikantet;
    }

    public void setMuzikantet(ArrayList<Muzikant> muzikantet) {
        this.muzikantet = muzikantet;
    }

    public void addMuzikant(Muzikant muzikant) {
        this.muzikantet.add(muzikant);
    }

    public String toString() {

        String result = "Orkestra: " + this.emri + "\n" +
                "Dirigjent: " + this.dirigjent + "\n" +
                "Muzikantet: " + this.muzikantet + "\n";

        return result;
    }

    //    save to file
    public void save2File() {
        try (BufferedWriter write = new BufferedWriter(new FileWriter("src/Detyra_Orkestra/output.txt"))) {
            write.write(toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
