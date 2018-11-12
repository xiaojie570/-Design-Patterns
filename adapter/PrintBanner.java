/**
 * Created by lenovo on 2018/10/12.
 */

// 适配器
public class PrintBanner extends Banner implements Print  {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParent();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
