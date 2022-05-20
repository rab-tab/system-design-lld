package VideoPlayer_StrategyPattern;

public class PhonePlayer extends VideoPlayer{

    public PhonePlayer(Device device, Resolution resolution) {
        this.device = device;
        this.deviceResolution = resolution;
    }
    public PhonePlayer() {
    }

    @Override
    void display() {
        this.getDevice();
        this.getResolution();

    }
}
