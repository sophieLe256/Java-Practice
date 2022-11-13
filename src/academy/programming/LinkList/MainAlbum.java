package academy.programming.LinkList;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainAlbum {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringe",2.2);
        album.addSong("Unholy",6.43);
        album.addSong("Reason",2.87);
        album.addSong("Animal",4.14);
        album.addSong("Left or Right",3.14);
        albums.add(album);

        album = new Album("For the rock stars", "AC/DC");
        album.addSong("For the rock stars", 7.54);
        album.addSong("Let her go", 5.32);
        album.addSong("Snowball", 8.42);
        album.addSong("Breakthrough", 5.64);
        albums.add(album);


        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);

    }
}
