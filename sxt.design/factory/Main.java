package factory;

/**
 * Created by lenovo on 2019/1/14.
 */
public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new HorseFactory();
        Moveable moveable = factory.create();
        moveable.run();
    }
}
