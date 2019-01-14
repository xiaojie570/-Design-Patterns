package abstract_factory;

/**
 * Created by lenovo on 2019/1/14.
 */
public class MagicFactory extends AbstractFactory{


    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    public Food createFood() {
        return new MushRoom();
    }
}
