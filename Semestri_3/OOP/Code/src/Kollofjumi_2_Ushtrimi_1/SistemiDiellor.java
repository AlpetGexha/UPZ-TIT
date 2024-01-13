package Kollofjumi_2_Ushtrimi_1;

import java.util.ArrayList;

public class SistemiDiellor {
    Ylli Ylli;
    ArrayList<Planeti> Planetet;

    public SistemiDiellor(Ylli ylli, ArrayList<Planeti> planetet) {
        Ylli = ylli;
        Planetet = planetet;
    }

    public Ylli getYlli() {
        return Ylli;
    }

    public void setYlli(Ylli ylli) {
        Ylli = ylli;
    }

    public ArrayList<Planeti> getPlanetet() {
        return Planetet;
    }

    public void setPlanetet(ArrayList<Planeti> planetet) {
        Planetet = planetet;
    }

    @Override
    public String toString() {
        return "SistemiDiellor{" +
                "Ylli=" + Ylli +
                ", Planetet=" + Planetet +
                '}';
    }
}
