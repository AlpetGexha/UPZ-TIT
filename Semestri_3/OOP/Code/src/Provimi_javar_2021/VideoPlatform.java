package Provimi_javar_2021;

import java.util.ArrayList;

public class VideoPlatform {
    private String emri;
    private String URL;
    private ArrayList<VideoSimple> videotSimple;
    private ArrayList<VideoSerial> videotSerial;

    @Override
    public String toString() {
        return "VideoPlatform{" +
                "emri='" + emri + '\'' +
                ", URL='" + URL + '\'' +
                ", videotSimple=" + videotSimple +
                ", videotSerial=" + videotSerial +
                '}' + '\n';
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public ArrayList<VideoSimple> getVideotSimple() {
        return videotSimple;
    }

    public void setVideotSimple(ArrayList<VideoSimple> videotSimple) {
        this.videotSimple = videotSimple;
    }

    public ArrayList<VideoSerial> getVideotSerial() {
        return videotSerial;
    }

    public void setVideotSerial(ArrayList<VideoSerial> videotSerial) {
        this.videotSerial = videotSerial;
    }

    public VideoPlatform(String emri, String URL, ArrayList<VideoSimple> videotSimple, ArrayList<VideoSerial> videotSerial) {
        this.emri = emri;
        this.URL = URL;
        this.videotSimple = videotSimple;
        this.videotSerial = videotSerial;
    }
}
