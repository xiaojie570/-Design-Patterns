package factory;

/**
 * Created by lenovo on 2019/1/14.
 */
public class PlaneFactory extends VehicleFactory {
    @Override
    Moveable create() {
        return new Plane();
    }
}
