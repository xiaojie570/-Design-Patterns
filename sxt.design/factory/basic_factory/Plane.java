package factory.basic_factory;

/**
 * Created by lenovo on 2019/1/14.
 */
public class Plane implements Moveable {
    @Override
    public void run() {
        System.out.println("扇着翅膀前进中 plane.........");
    }
}
