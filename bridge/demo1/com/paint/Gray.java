package demo1.com.paint;

/**
 * Created by lenovo on 2018/11/8.
 */
public class Gray implements Color{
    @Override
    public void bePaint(String shape) {
        System.out.println("灰色的:" + shape);
    }
}
