package Java_14;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Aktori a1 = new Aktori("111", "Aktori1");
        Aktori a2 = new Aktori("112", "Aktori2");
        Aktori a3 = new Aktori("113", "Aktori3");

        ArrayList<Aktori> a = new ArrayList<>();
        a.add(a1);
        a.add(a2);
        a.add(a3);

        Skenaristi s1 = new Skenaristi("121", "Skenaristi1", 6);
        Skenaristi s2 = new Skenaristi("122", "Skenaristi2", 3);

        ArrayList<Skenaristi> s = new ArrayList<>();
        s.add(s1);
        s.add(s2);

        Regjisori r1 = new Regjisori("101", "Regjisori1", 8);

        Filmi f1 = new Filmi("Filmi1", r1, s, a);

        a1.addFilmi(f1);
        a2.addFilmi(f1);
        a3.addFilmi(f1);

        System.out.println(r1);
        System.out.println(s1);
        System.out.println(a1);
        System.out.println(f1);

        a1.printoFilmat();
    }
}