package filter.filter2;

/**
 * Created by lenovo on 2019/1/19.
 */
public class SesitiveFilter implements Filter {
    @Override
    public String doFilter(String str) {
        String r = str.replace("被就业","就业")
                .replace("敏感","");
        return r;
    }
}
