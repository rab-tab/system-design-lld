package MediaPlayer_AdapterPattern;

public class MediaPlayerImpl implements MediaPlayer {

    MediaPlayerAdapter mediaPlayerAdapter;
    MediaPlayer mediaPlayer;

    @Override
    public void play(String format, String file) {
        if (format.equals("mp3")) {
            mediaPlayer = new DefaultMediaPlayer();
            mediaPlayer.play(format, file);
        } else {
            AdvancedFormat advancedFormat = new AdvancedFormat();
            advancedFormat.setResolution("720p");
            mediaPlayer = new MediaPlayerAdapter(advancedFormat);
            mediaPlayer.play(format, file);
        }

    }


}
