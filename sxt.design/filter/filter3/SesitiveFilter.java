package filter.filter3;


/**
 * Created by lenovo on 2019/1/19.
 */
public class SesitiveFilter implements Filter {


    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.requestStr = request.requestStr.replace("被就业","就业")
                .replace("敏感","");
        filterChain.doFilter(request,response,filterChain);
        response.responseStr += "======SesitiveFilter";
    }
}
