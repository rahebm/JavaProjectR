package Class21;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E2AudioPlayer {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        FileInputStream fis=new FileInputStream("C:\\Users\\Raheb\\IdeaProjects\\JavaprojectR\\src\\main\\java\\Class21\\Ambient-music-free.mp3");
        Player mp3Player=new Player(fis);
        mp3Player.play();
    }
}
