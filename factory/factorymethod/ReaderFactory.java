package factorymethod;

/**
 * 现在我们按照定义所说定义一个抽象的工厂接口
 */
public interface ReaderFactory {
    // 用于返回我们的Reader类
    Reader getReader();
}
