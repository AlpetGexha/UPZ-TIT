package Detyra_ProjectManagement.Aplication;

// abstract
public class Project {
    String emri;
    String deadline;

    public Project(String emri, String deadline) {
        this.emri = emri;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Project{" +
                "emri='" + emri + '\'' +
                ", deadline='" + deadline + '\'' +
                '}';
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
