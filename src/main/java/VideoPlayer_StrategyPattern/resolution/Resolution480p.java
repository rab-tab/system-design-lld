package VideoPlayer_StrategyPattern.resolution;

import VideoPlayer_StrategyPattern.Resolution;

public class Resolution480p implements Resolution {
    @Override
    public void resolution() {
        System.out.println("Resolution 480p");
    }
}
