package factory.spring_factory;

/**
 * Created by lenovo on 2019/1/19.
 */
public class Train implements Moveable{
    @Override
    public void run() {
        System.out.println("小火车，呜呜呜呜....");
    }
}
