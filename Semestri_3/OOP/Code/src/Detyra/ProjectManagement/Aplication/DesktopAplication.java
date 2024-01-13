package Detyra.ProjectManagement.Aplication;

public class DesktopAplication extends Project {
    String platforma;

    public DesktopAplication(String emri, String deadline, String platforma) {
        super(emri, deadline);
        this.platforma = platforma;
    }

    @Override
    public String toString() {
        return "DesktopAplication{" +
                "platforma='" + platforma + '\'' +
                super.toString() +
                '}';
    }
}
