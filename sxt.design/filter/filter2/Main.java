package filter.filter2;


/**
 * Created by lenovo on 2019/1/19.
 */
public class Main {

    public static void main(String[] args) {
        String msg = "大家好:)，<script>,敏感，被就业，网络授课没感觉，因为看不见大家火儿";

        MsgProcessor msgProcessor = new MsgProcessor();
        msgProcessor.setMsg(msg);

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter())
                .addFilter(new SesitiveFilter());

        FilterChain filterChain1 = new FilterChain();
        filterChain1.addFilter(new NewFilter())
                .addFilter(new FaceFilter());

        filterChain.addFilter(filterChain1);

        msgProcessor.setFilters(filterChain);

        String result = msgProcessor.process();

        System.out.println(result);
    }
}
