/**
 * Created by lenovo on 2018/10/12.
 */

// 交流100V电压

public class Banner {
    private String string;
    public Banner(String string) {
        this.string = string;
    }

    public void showWithParent() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}

