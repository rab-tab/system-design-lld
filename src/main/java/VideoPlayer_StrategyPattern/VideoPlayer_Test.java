package VideoPlayer_StrategyPattern;

import VideoPlayer_StrategyPattern.device.Phone;
import VideoPlayer_StrategyPattern.device.TV;
import VideoPlayer_StrategyPattern.resolution.Resolution1080p;
import VideoPlayer_StrategyPattern.resolution.Resolution480p;

public class VideoPlayer_Test {
    public static void main(String[] args) {
        Resolution resolution = new Resolution1080p();
        Device device = new TV();
        VideoPlayer player = new TvVideoPlayer(device, resolution);
        player.display();

        Resolution resolution1 = new Resolution480p();
        Device device1 = new Phone();
        VideoPlayer player1 = new TvVideoPlayer(device, resolution);
        player1.display();

    }
}
