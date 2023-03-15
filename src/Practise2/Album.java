package Practise2;
/*
Select a site and describe fields, methods, and entities. Please provide a link to the site.
The site must contain decent content.
https://music.youtube.com
 */
import jdk.internal.icu.text.UnicodeSet;

public class Album {
    private String name;
    private Artist artist;
    private Genre genre;
    private int year;
    private String link;
    private String albumInfo;
    private static int albumId = 0;
    private UnicodeSet albums;

    private Album(String name, Artist artist, Genre genre, int year, String link, String albumInfo, UnicodeSet albums) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.link = link;
        this.albumInfo = albumInfo;
        this.albumId = getAlbumId();
        this.albums = albums;
    }

    public int getAlbumId() {
        return albumId++;
    }

    public void addAlbumToPlaylist(Album album, Playlist playlist) {
        //TODO some magic
    }
    public void printAlbumInfoFromWiki(){
        albumInfo = getInfoFromWiki(name);
        System.out.println(albumInfo);
    }

    private String getInfoFromWiki(String name) {
        String info = new String();
        //TODO method logic
        return info;
    }

    public String getName() {
        return name;
    }

    public Artist getArtist() {
        return artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public String getLink() {
        return link;
    }

    public String getAlbumInfo() {
        return albumInfo;
    }

    public UnicodeSet getAlbums() {
        return albums;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artist=" + artist +
                ", genre=" + genre +
                ", year=" + year +
                ", link='" + link + '\'' +
                ", albumInfo='" + albumInfo + '\'' +
                '}';
    }
}
