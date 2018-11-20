package factorymethod;

/**
 * Created by lenovo on 2018/11/20.
 */
public class PngReaderFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return new PngReader();
    }
}
