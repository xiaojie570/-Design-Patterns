package factory.abstract_factory;

/**
 * Created by lenovo on 2019/1/14.
 */
public abstract class AbstractFactory {
    public abstract Vehicle createVehicle();
    public abstract Weapon createWeapon();
    public abstract Food createFood();
}
