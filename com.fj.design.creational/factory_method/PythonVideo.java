package factory_method;

/**
 * Created by lenovo on 2019/1/5.
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python视频。。。");
    }
}
