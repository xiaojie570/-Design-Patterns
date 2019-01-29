package factory_method;

// 如果里面有一些方法是已知的，就可以使用抽象类
public abstract class VideoFactory {
    public abstract Video getVideo();
}
