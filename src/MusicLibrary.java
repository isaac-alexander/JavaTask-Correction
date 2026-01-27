// 15. Write a Java program to create a class called "MusicLibrary" with a collection of songs and
// methods to add and remove songs, and to play a random song.

import java.util.HashMap;
import java.util.Map;

public class MusicLibrary {
    private Map<Integer, String> songs;

    public MusicLibrary() {
        this.songs = new HashMap<>();
    }

    public void addSong(Integer trackNum, String songTitle) {
        this.songs.put(trackNum, songTitle);
    }

    public void removeSong(Integer trackNum) {
        this.songs.remove(trackNum);
    }

    public void playRandomSong() {
        int randomNumber = (int) (Math.random() * this.songs.size());
        if (randomNumber == 0) {
            randomNumber++;
        }
        this.songs.get(2);
        System.out.println("Now playing song number " + 2 + " Song Title: " + this.songs.get(2));
    }
}