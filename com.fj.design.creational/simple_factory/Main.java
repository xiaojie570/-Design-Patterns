package simple_factory;

/**
 * Created by lenovo on 2019/1/5.
 */
public class Main {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null)
            return;
        video.produce();
    }
}
