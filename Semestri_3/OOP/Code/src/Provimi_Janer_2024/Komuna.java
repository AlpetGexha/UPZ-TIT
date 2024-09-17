package Provimi_Janer_2024;
import java.util.ArrayList;

public class Komuna {
    public President president;
    public ArrayList<NenPresident> nenpresidents;
    public ArrayList<Employee> employees;


    public Komuna(President president, ArrayList<NenPresident> nenpresidents, ArrayList<Employee> employees) {
        this.president = president;
        this.nenpresidents = nenpresidents;
        this.employees = employees;
    }

    public President getPresident() {
        return president;
    }

    public void setPresident(President president) {
        this.president = president;
    }

    public ArrayList<NenPresident> getNenpresidents() {
        return nenpresidents;
    }

    public void setNenpresidents(ArrayList<NenPresident> nenpresidents) {
        this.nenpresidents = nenpresidents;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
