package factory_method;

public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制 FE 视频。。。");
    }
}
