package Detyra_ProjectManagement;

import java.util.ArrayList;

public class Punotri {
    String personalID;
    Role role;
    ArrayList<Projecti> projekte;

    public Punotri(String personalID, Role role, ArrayList<Projecti> projekte) {
        this.personalID = personalID;
        this.role = role;
        this.projekte = projekte;
    }

    public String getPersonalID() {
        return personalID;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public ArrayList<Projecti> getProjekte() {
        return projekte;
    }

    public void setProjekte(ArrayList<Projecti> projekte) {
        this.projekte = projekte;
    }

    @Override
    public String toString() {
        return "Punotri{" +
                "personalID='" + personalID + '\'' +
                ", role=" + role +
                ", projekte=" + projekte +
                '}';
    }
}
