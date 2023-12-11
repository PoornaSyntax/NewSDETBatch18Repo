package class15;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E2AudioPlayer {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        FileInputStream fis = new FileInputStream("C:\\Users\\poorn\\IdeaProjects\\NewSDETBAtch18\\src\\main\\java\\class15\\the-beat-of-nature-122841.mp3");
        Player player = new Player(fis);
        player.play();

    }
}
