package MediaPlayer_AdapterPattern;

public class AviPlayer implements AdvanceMediaPlayer{
    @Override
    public void playAdvancedFormat(AdvancedFormat advancedFormat) {
        System.out.println("playing using advanced media player...format is "+advancedFormat.getFormatToPlay());
    }
}
