package MediaPlayer_AdapterPattern;

public class MediaPlayerTest {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayerImpl();
        mediaPlayer.play("mp3","my song" );
        mediaPlayer.play("avi","my song advance format" );

    }
}
