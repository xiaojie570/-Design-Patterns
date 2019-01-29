package factory_method;

public class Main {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        VideoFactory videoFactory1 = new JavaVideoFactory();
        VideoFactory videoFactory2 = new FEVideoFactoty();
        Video video = videoFactory.getVideo();
        video.produce();
        videoFactory1.getVideo().produce();
        videoFactory2.getVideo().produce();
    }
}
