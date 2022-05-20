package VideoPlayer_StrategyPattern.device;

import VideoPlayer_StrategyPattern.Device;

public class Phone implements Device {
    @Override
    public void device() {
        System.out.println("Playing video on Phone");
    }
}
