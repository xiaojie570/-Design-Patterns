package demo1.com.paint;

/**
 * Created by lenovo on 2018/11/8.
 */
public class White implements Color {
    @Override
    public void bePaint(String shape) {
        System.out.println("白色的：" + shape);
    }
}
