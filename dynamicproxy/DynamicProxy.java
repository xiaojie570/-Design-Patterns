import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Subject是一个接口，被代理类需要实现该接口，动态代理类需要组合该接口，同时动态代理类要实现InvocationHandler接口
 * 动态代理类的构造函数中需要有Subject接口
 * 动态代理类在invoke方法中，通过method的invoke方法来实现反射机制。
 */
public class DynamicProxy implements InvocationHandler{

    public Subject targetSubject;

    public DynamicProxy(Subject targetSubject) {
        this.targetSubject = targetSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行invoke代码，执行的方法名字是：" + method.getName());
        String ret = (String) method.invoke(targetSubject,args);
        return ret;
    }

    public static void main(String[] args) {
        Subject targetSubject = new TargetSubject_2();
        DynamicProxy handler = new DynamicProxy(targetSubject);

        Subject proxySubject = (Subject) Proxy.newProxyInstance(targetSubject.getClass().getClassLoader(),targetSubject.getClass().getInterfaces(),handler);

        proxySubject.getResponse("hei fujie");
    }
}
