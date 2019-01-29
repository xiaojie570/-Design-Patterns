package factory_method;

public class FEVideoFactoty extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
