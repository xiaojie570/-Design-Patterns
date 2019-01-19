package filter.filter2;

/**
 * Created by lenovo on 2019/1/19.
 */
public class HTMLFilter implements Filter {
    @Override
    public String doFilter(String str) {
        // 链式编程
        String r = str.replace('<','[')
                .replace('>',']');
        return r;
    }
}
