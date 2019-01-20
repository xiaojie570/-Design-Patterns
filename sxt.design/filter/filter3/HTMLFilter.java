package filter.filter3;


/**
 * Created by lenovo on 2019/1/19.
 */
public class HTMLFilter implements Filter {


    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.requestStr = request.requestStr.replace('<','[').replace('>',']');
        filterChain.doFilter(request,response,filterChain);

        response.responseStr += "======HTMLFilter";
    }
}
