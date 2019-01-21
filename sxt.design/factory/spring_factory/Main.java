package factory.spring_factory;

import java.util.Properties;

/**
 * Created by lenovo on 2019/1/19.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        Properties pros = new Properties();
        // 将 class 文件装载到内存
        pros.load(Main.class.getClassLoader().getResourceAsStream("factory/spring_factory/spring.properties"));
        String vehicleTypeName = pros.getProperty("VehicleType");
        System.out.println(vehicleTypeName);
        // 将这个字符串所代表的类转载到内存，然后new Instance 会产生一个对象，产生这个对象是根据空构造方法。
        Object c = Class.forName(vehicleTypeName).newInstance();

        Moveable moveable = (Moveable) c;
        moveable.run();
    }
}
