package Detyra_ProjectManagement;

public class UebSite extends Projecti {
    String url;

    public UebSite(String emri, String deadline, String url) {
        super(emri, deadline);
        this.url = url;
    }

    @Override
    public String toString() {
        return "UebSite{" +
                "url='" + url + '\'' +
                super.toString() +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
