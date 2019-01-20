package filter.filter3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2019/1/20.
 */
public class FilterChain implements  Filter {
    List<Filter> filters = new ArrayList<>();

    private int index = 0;
    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }
    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
        if(index == filters.size()) return;

        Filter filter = filters.get(index);
        index ++;
        filter.doFilter(request,response,filterChain);

    }
}
