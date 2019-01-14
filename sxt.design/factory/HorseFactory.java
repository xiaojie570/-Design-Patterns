package factory;

/**
 * Created by lenovo on 2019/1/14.
 */
public class HorseFactory extends VehicleFactory{
    @Override
    Moveable create() {
        return new Horse();
    }
}
