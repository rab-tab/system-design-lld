package VideoPlayer_StrategyPattern.device;

import VideoPlayer_StrategyPattern.Device;

public class TV implements Device {
    @Override
    public void device() {
        System.out.println("Playing video on TV");
    }
}
