package Detyra_ProjectManagement;

public class UebAplication extends Projecti {
    String programingLanguage;

    public UebAplication(String emri, String deadline, String programingLanguage) {
        super(emri, deadline);
        this.programingLanguage = programingLanguage;
    }

    @Override
    public String toString() {
        return "UebAplication{" +
                "programingLanguage='" + programingLanguage + '\'' +
                super.toString() +
                '}';
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.programingLanguage = programingLanguage;
    }
}
