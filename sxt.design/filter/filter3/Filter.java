package filter.filter3;

/**
 * Created by lenovo on 2019/1/20.
 */
public interface Filter {
    // 你可以把一个 Request 对象交给我，把一个空的 Response 对象交给我，我所有处理完的信息，都放到 Response中
    void doFilter(Request request,Response response,FilterChain filterChain);
}
