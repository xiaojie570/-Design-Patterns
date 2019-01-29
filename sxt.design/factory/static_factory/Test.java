package factory.static_factory;

import factory.basic_factory.Moveable;
import factory.basic_factory.Plane;

/**
 * Created by lenovo on 2019/1/14.
 */
public class Test {
    public static void main(String[] args) {
        Moveable c = new Plane();
        c.run();
    }
}
