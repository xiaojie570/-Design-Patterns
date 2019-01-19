package filter.filter2;

/**
 * Created by lenovo on 2019/1/19.
 */
public class NewFilter implements  Filter{

    @Override
    public String doFilter(String str) {
        String r = str.replace("网络","现实");
        return r;
    }
}
