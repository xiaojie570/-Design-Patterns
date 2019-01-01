package factorymethod;

/**
    工厂方法模式是简单工厂的进一步深化，在工厂方法模式中，我们不再提供统一的工厂类来创建所有的对象，
    而是针对不同的对象提供不同的工厂。也就是说每个对象都有一个与之对应的工厂。

    【定义】：
        定义一个用于创建对象的接口，让子类决定将哪一个类实例化。工厂方法模式让一个类的实例化延迟到其子类

    【实例】：
        现在需要设计一个这样的图片加载类，它具有多个图片加载器，用来加载jpg、png、gif格式的图片，
        每个加载器都有一个read方法，用于读取图片。

    【使用场景】：
         客户端不需要知道它所创建的对象的类。例子中我们不知道每个图片加载器具体叫什么名，只知道创建它的工厂名就完成了床架过程。
 */

public class FactoryMehtodMain {
    public static void main(String[] args) {
        ReaderFactory factory = new JpgReaderFactory();
        Reader reader = factory.getReader();
        reader.read();
    }
}
