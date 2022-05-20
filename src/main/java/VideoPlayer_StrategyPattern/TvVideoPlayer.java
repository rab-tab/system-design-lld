package VideoPlayer_StrategyPattern;

public class TvVideoPlayer extends VideoPlayer {
    public TvVideoPlayer(Device device, Resolution resolution) {
        this.device = device;
        this.deviceResolution = resolution;
    }

    @Override
    void display() {
        this.getDevice();
        this.getResolution();

    }
}
