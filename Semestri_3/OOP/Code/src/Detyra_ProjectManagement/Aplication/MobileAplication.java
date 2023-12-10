package Detyra_ProjectManagement.Aplication;

public class MobileAplication extends Project {
    String platforma;
    String versioni;


    public MobileAplication(String emri, String deadline, String platforma, String versioni) {
        super(emri, deadline);
        this.platforma = platforma;
        this.versioni = versioni;
    }

    @Override
    public String toString() {
        return "MobileAplication{" +
                "platforma='" + platforma + '\'' +
                ", versioni='" + versioni + '\'' +
                super.toString() +
                '}';
    }

    public String getPlatforma() {
        return platforma;
    }

    public void setPlatforma(String platforma) {
        this.platforma = platforma;
    }

    public String getVersioni() {
        return versioni;
    }

    public void setVersioni(String versioni) {
        this.versioni = versioni;
    }
}

