package filter.filter2;

import com.sun.org.apache.bcel.internal.generic.FCMPG;

/**
 * Created by lenovo on 2019/1/19.
 */
public class MsgProcessor {
    private String msg;

   // Filter[] filters = {new HTMLFilter(),new SesitiveFilter(),new FaceFilter()};

    FilterChain filters = new FilterChain();

    public FilterChain getFilters() {
        return filters;
    }

    public void setFilters(FilterChain filters) {
        this.filters = filters;
    }

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
        String r = filters.doFilter(msg);
        return r;
    }
}
