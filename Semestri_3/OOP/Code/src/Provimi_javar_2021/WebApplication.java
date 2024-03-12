package Provimi_javar_2021;

import java.util.ArrayList;

public class WebApplication extends VideoPlatform {
    private String programinLanguage;
    private ArrayList<String> teknologjite;

    public WebApplication(String emri, String URL, ArrayList<VideoSimple> videotSimple, ArrayList<VideoSerial> videotSerial, String programinLanguage, ArrayList<String> teknologjite) {
        super(emri, URL, videotSimple, videotSerial);
        this.programinLanguage = programinLanguage;
        this.teknologjite = teknologjite;
    }

    @Override
    public String toString() {
        return "WebApplication{" +
                "programinLanguage='" + programinLanguage + '\'' +
                ", teknologjite=" + teknologjite +
                ", Super=" + super.toString() +
                '}' + '\n';
    }

    public String getPrograminLanguage() {
        return programinLanguage;
    }

    public void setPrograminLanguage(String programinLanguage) {
        this.programinLanguage = programinLanguage;
    }

    public ArrayList<String> getTeknologjite() {
        return teknologjite;
    }

    public void setTeknologjite(ArrayList<String> teknologjite) {
        this.teknologjite = teknologjite;
    }
}
