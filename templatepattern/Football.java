/**
 * Created by lenovo on 2018/11/12.
 */
public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("开始热身啦！马上要开始踢足球啦！！！！");
    }

    @Override
    void startPlay() {
        System.out.println("比赛开始，要使劲踢足球鸭！！！加油呀！！！");
    }

    @Override
    void endPlay() {
        System.out.println("足球比较已经结束啦！！！！");
    }
}
