package filter.filter1;



/**
 * Created by lenovo on 2019/1/19.
 */
public class Main {

    public static void main(String[] args) {
        String msg = "大家好:)，<script>,敏感，被就业，网络授课没感觉，因为看不见大家火儿";

        MsgProcessor msgProcessor = new MsgProcessor();
        msgProcessor.setMsg(msg);

        String result = msgProcessor.process();

        System.out.println(result);
    }
}
