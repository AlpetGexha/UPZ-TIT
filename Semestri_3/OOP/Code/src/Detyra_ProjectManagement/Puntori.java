package Detyra_ProjectManagement;

import Detyra_ProjectManagement.Enum.Role;

import java.util.ArrayList;

public class Puntori {
    String personalID;
    Role role;
    ArrayList<Project> projekte;

    public Puntori(String personalID, Role role, ArrayList<Project> projekte) {
        this.personalID = personalID;
        this.role = role;
        this.projekte = projekte;
    }

    public Puntori(String personalID, Role role, Project projekte) {
        this.personalID = personalID;
        this.role = role;
        this.projekte = new ArrayList<Project>();
        this.projekte.add(projekte);
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

    public ArrayList<Project> getProjekte() {
        return projekte;
    }

    public void setProjekte(ArrayList<Project> projekte) {
        this.projekte = projekte;
    }

    @Override
    public String toString() {
        return "Puntori{" +
                "personalID='" + personalID + '\'' +
                ", role=" + role +
                ", projekte=" + projekte +
                '}' + "\n";
    }
}
