package factorymethod;

/**
 * Gif加载工厂
 */
public class GifReaderFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return new GifReader();
    }
}
