package factory.abstract_factory;

/**
 * Created by lenovo on 2019/1/14.
 */
public class DefaultFactory extends AbstractFactory{
    @Override
    public Vehicle createVehicle() {
        return new Horse();
    }

    @Override
    public Weapon createWeapon() {
        return new AKM();
    }

    @Override
    public Food createFood() {
        return new Apple();
    }

}
