package filter.filter1;

/**
 * Created by lenovo on 2019/1/19.
 */
public class MsgProcessor {
    private String msg;

    Filter[] filters = {new HTMLFilter(),new SesitiveFilter(),new FaceFilter()};

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 当接收到了消息，要怎么处理呢？
     * 利用String 的 replace 方法
     * @return
     */
    public String process() {
        String r = msg;
        for(Filter filter:filters) {

            r = filter.doFilter(r);
        }
        return r;
    }
}
