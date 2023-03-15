package Practise2;
/*
Select a site and describe fields, methods, and entities. Please provide a link to the site.
The site must contain decent content.
https://music.youtube.com
 */
public class Song implements MusicPlayable{
    private String name;
    private Artist artist;
    private Album album;
    private Genre genre;
    private int year;
    private double duration;
    private static int id = 0;
    private String link;

    public Song(String name, Artist artist, Album album, Genre genre, int year, double duration, int id, String link) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
        this.id = getNextId();
        this.link = link;
    }

    public int getNextId() {
        return id++;
    }

    public void addSongToPlaylist(User user, Playlist playlist, Song song){
        if(user.isRegistered()) {
        playlist.addSong(song, playlist); }
    }

    public void shareSongInSocialNetworks(){
        String shareUrl = "https://www.instagram.com/?url=" + link;
        // TODO: open Instagram share dialog with shareUrl
    }

    public String getName() {
        return name;
    }

    public Artist getArtist() {
        return artist;
    }

    public Album getAlbum() {
        return album;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getDuration() {
        return duration;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", album=" + album +
                ", genre=" + genre +
                ", year=" + year +
                ", duration=" + duration +
                ", link='" + link + '\'' +
                '}';
    }

    @Override
    public void play() {
        //TODO some magic
    }
}
