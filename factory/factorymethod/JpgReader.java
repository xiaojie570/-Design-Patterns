package factorymethod;

/**
 * Created by lenovo on 2018/11/20.
 */
public class JpgReader implements Reader{

    @Override
    public void read() {
        System.out.println("read jpg");
    }
}
