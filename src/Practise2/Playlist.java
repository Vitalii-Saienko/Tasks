package Practise2;
/*
Select a site and describe fields, methods, and entities. Please provide a link to the site.
The site must contain decent content.
https://music.youtube.com
 */
import java.util.List;

public class Playlist {

    private String name;
    private static int playlistId = 0;
    List<Album> albums;


    public Playlist(String name, List<Album> albums) {
        this.name = name;
        this.albums = albums;
    }

    public static int getPlaylistId() {
        return playlistId++;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", albums=" + albums +
                '}';
    }

    void addSong(Song song, Playlist playlist) {
    }

    private static void addPlaylistToFavorites() {
    }
}
