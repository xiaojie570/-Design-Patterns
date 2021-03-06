package factory.abstract_factory;

/**
 * Created by lenovo on 2019/1/14.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new DefaultFactory();
        Vehicle vehicle = abstractFactory.createVehicle();
        Food food = abstractFactory.createFood();
        Weapon weapon = abstractFactory.createWeapon();

        vehicle.run();
        food.printName();
        weapon.shoot();
    }
}
