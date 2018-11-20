package factorymethod;

/**
 * Jpg加载工厂
 */
public class JpgReaderFactory implements ReaderFactory {
    @Override
    public Reader getReader() {
        return new JpgReader();
    }
}
