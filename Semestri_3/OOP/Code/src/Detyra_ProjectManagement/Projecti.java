package Detyra_ProjectManagement;

public class Projecti {
    String emri;
    String deadline;

    public Projecti(String emri, String deadline) {
        this.emri = emri;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Projecti{" +
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
