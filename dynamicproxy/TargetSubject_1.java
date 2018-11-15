/**
 * Created by lenovo on 2018/11/15.
 */
public class TargetSubject_1 implements Subject{
    @Override
    public String getResponse(String url) {
        System.out.println("第一个代理类对象中的——getResponse：" + url);
        return url;
    }

    @Override
    public void getCookie(String url) {
        System.out.println("第一个代理类对象中的——getCookie：" + url);
    }

    @Override
    public String getUpdateTime() {
        System.out.println("第一个代理类对象中的——getUpdateTime：" );
        long time = System.currentTimeMillis();
        return String.valueOf(time);
    }
}
