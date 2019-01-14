package abstract_factory;

import factory.HorseFactory;
import factory.Moveable;
import factory.VehicleFactory;

/**
 * Created by lenovo on 2019/1/14.
 */
public class Main {
    public static void main(String[] args) {
        Horse h = new Horse();
        AKM akm = new AKM();
        akm.shoot();
        Apple apple = new Apple();
        apple.getName();
        h.run();
    }
}
