package filter.filter1;

/**
 * Created by lenovo on 2019/1/19.
 */
public class FaceFilter implements Filter{
    @Override
    public String doFilter(String str) {
        String r = str.replace(":)","^0^");
        return r;
    }
}
