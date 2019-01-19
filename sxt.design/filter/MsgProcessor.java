package filter;

/**
 * Created by lenovo on 2019/1/19.
 */
public class MsgProcessor {
    private String msg;

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
        // process the html tag <>
        // 链式编程
        String r = msg.replace('<','[')
                .replace('>',']');

        // process the sensitive words
        r = r.replace("被就业","就业")
        .replace("敏感","");


        return r;
    }
}
