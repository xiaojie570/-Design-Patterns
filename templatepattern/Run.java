/**
 * Created by lenovo on 2018/11/12.
 */
public class Run extends Game {
    @Override
    void initialize() {
        System.out.println("开始热身啦！马上要开始跑步啦！！！！");
    }

    @Override
    void startPlay() {
        System.out.println("开始跑步！！！冲鸭！！！！");
    }

    @Override
    void endPlay() {
        System.out.println("跑完步啦！！！！！！");
    }
}
