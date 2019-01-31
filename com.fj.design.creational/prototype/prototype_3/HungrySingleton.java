package prototype.prototype_3;

import java.io.Serializable;

public class HungrySingleton implements Cloneable, Serializable {
    private static HungrySingleton ourInstance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return ourInstance;
    }

    private HungrySingleton() {
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
