package Provimi_javar_2021;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        VideoSimple videoSimple1 = new VideoSimple("VideoSimple1", 360, 2);
        VideoSimple videoSimple2 = new VideoSimple("VideoSimple2", 30, 3);
        VideoSimple videoSimple3 = new VideoSimple("VideoSimple3", 460, 5);

        ArrayList<VideoSimple> videotSerial = new ArrayList<>();

        videotSerial.add(videoSimple1);
        videotSerial.add(videoSimple2);

        VideoSerial videoSerial1 = new VideoSerial("VideoSerial1", videotSerial);

        ArrayList<VideoSerial> serialet = new ArrayList<>();

        VideoPlatform videoPlatform1 = new VideoPlatform("VideoPlatform1", "URL1", videotSerial, serialet);

        WebApplication webApplication1 = new WebApplication("WebApplication1", "URL2", videotSerial, serialet, "Java", new ArrayList<>());

        System.out.println(webApplication1);
    }
}
