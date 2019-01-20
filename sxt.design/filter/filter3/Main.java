package filter.filter3;

/**
 * Created by lenovo on 2019/1/20.
 */
public class Main {
    public static void main(String[] args) {
        String msg = "大家好:)，<script>,敏感，被就业，网络授课没感觉，因为看不见大家火儿";

        Request request = new Request();
        request.setRequestStr(msg);

        Response response = new Response();
        response.setResponseStr("response");

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter())
                    .addFilter(new SesitiveFilter());

        filterChain.doFilter(request,response,filterChain);

        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());
    }
}
