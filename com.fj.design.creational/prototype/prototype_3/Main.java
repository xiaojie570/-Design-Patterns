package prototype.prototype_3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
       /* Date date = new Date(0L);
        Pig pig = new Pig("佩奇",date);
        Pig pig1 = (Pig) pig.clone();
        System.out.println(pig);
        System.out.println(pig1);

        pig.getBirthDay().setTime(6666L);
        System.out.println(pig);
        System.out.println(pig1);*/
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);
    }
}
