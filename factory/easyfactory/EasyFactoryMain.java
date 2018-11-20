package easyfactory;

/**
 * Created by lenovo on 2018/11/20.
 * 简单工厂模式其实并不算是一种设计模式，更多的时候是一种编程习惯
 *
 * 定义：定义一个工厂类，根据传入的参数不同返回不同的实例，被创建的实例具有共同的父类或者接口
 *
 * 适用场景：
 * 　　其实由定义也大概能推测出其使用场景，首先由于只有一个工厂类，所以工厂类中创建的对象不能太多，否则工厂类的业务逻辑就太复杂了，其次由于工厂类封装了对象的创建过程，所以客户端应该不关心对象的创建。总结一下适用场景：
 　　（1）需要创建的对象较少。
 　　（2）客户端不关心对象的创建过程。
 */
public class EasyFactoryMain {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("rect");
        shape.draw();
    }
}
