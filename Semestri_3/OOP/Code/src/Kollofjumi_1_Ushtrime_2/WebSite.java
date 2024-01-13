package Kollofjumi_1_Ushtrime_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WebSite {
    //    private URL url_address;
    private String url_address;
    private String titulli;
    private int numriVizitorve;

    public WebSite(String url_address, String titulli, int numriVizitorve) {
        this.url_address = url_address;
        this.titulli = titulli;
        this.numriVizitorve = numriVizitorve;
    }

    public WebSite() {
        this.url_address = "";
        this.titulli = "";
        this.numriVizitorve = 0;
    }

    public String getUrl_address() {
        return url_address;
    }

    public void setUrl_address(String url_address) {
        this.url_address = url_address;
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public int getNumriVizitorve() {
        return numriVizitorve;
    }

    public void setNumriVizitorve(int numriVizitorve) {
        this.numriVizitorve = numriVizitorve;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() == this.getClass()) return true;

        if (obj instanceof WebSite webSite) {
            return this.url_address.equals(webSite.url_address);
        }

        return false;
    }

    public String popullarity() {

        if (this.numriVizitorve > 10000) {
            return "shume_populuar";
        }

        if (this.numriVizitorve >= 1000 && this.numriVizitorve < 10000) {
            return "mesatarisht_populuar";
        }

        return "pak_populuar";
    }

    @Override
    public String toString() {

        return String.format("URL: %s\nTitulli: %s\nPopullariteti: %s me %d shikime\n\n\n",
                this.url_address, this.titulli, this.popullarity(), this.numriVizitorve
        );
    }

    public void printDataOnFile() {

        try (BufferedWriter write = new BufferedWriter(new FileWriter("src/Kollofjumi_1_Ushtrime_2/output.txt", true))) {
            write.write(toString());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
