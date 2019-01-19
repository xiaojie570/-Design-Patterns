package filter.filter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2019/1/19.
 */
public class FilterChain {
    private List<Filter> filterList = new ArrayList<>();



    public  FilterChain addFilter(Filter filter) {
        this.filterList.add(filter);
        return this;
    }

    public String doFilter(String str) {
        String r = str;
        for(Filter filter: filterList) {
            r = filter.doFilter(r);
        }
        return r;
    }
}
