package factorymethod;

/**
 * Created by lenovo on 2018/11/20.
 */
public class PngReader implements Reader {
    @Override
    public void read() {
        System.out.println("read png");
    }
}
