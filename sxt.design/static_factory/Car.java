package static_factory;

/**
 * Created by lenovo on 2019/1/14.
 * 静态工厂方法
 */
public class Car {

    private static Car car = new Car();

    private Car() {}

    public static Car getInstance() {
        return car;
    }

    public void run() {
        System.out.println("冒着烟奔跑中 car。。。。");
    }
}
