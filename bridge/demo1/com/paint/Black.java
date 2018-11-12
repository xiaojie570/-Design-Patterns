package demo1.com.paint;

/**
 * Created by lenovo on 2018/11/8.
 */
public class Black implements Color {
    @Override
    public void bePaint(String shape) {
        System.out.println("黑色的:" + shape);
    }
}
