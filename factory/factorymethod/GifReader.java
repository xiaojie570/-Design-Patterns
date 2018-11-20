package factorymethod;

/**
 * Created by lenovo on 2018/11/20.
 */
public class GifReader implements Reader{
    @Override
    public void read() {
        System.out.println("read gif");
    }
}
