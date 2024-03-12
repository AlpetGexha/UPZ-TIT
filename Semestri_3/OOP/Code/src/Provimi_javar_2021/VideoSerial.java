package Provimi_javar_2021;

import java.util.ArrayList;

public class VideoSerial {
    private String titulli;
    private int numriEpisodave;

    private ArrayList<VideoSimple> videot;

    public VideoSerial(String titulli, ArrayList<VideoSimple> videot) {
        this.titulli = titulli;
        this.videot = videot;

        this.numriEpisodave += videot.size();
    }

    @Override
    public String toString() {
        return "VideoSerial{" +
                "titulli='" + titulli + '\'' +
                ", numriEpisodave=" + numriEpisodave +
                ", videot=" + videot +
                '}' + '\n';
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public int getNumriEpisodave() {
        return numriEpisodave;
    }

    public void setNumriEpisodave(int numriEpisodave) {
        this.numriEpisodave = numriEpisodave;
    }

    public ArrayList<VideoSimple> getVideot() {
        return videot;
    }

    public void setVideot(ArrayList<VideoSimple> videot) {
        this.videot = videot;
    }

    //    optional
    public void shtoVideo(VideoSimple video) {
        this.videot.add(video);
        this.numriEpisodave++;
    }

    public void fshijVideo(VideoSimple video) {
        this.videot.remove(video);
        this.numriEpisodave--;
    }
}
