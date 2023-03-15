package Practise2;
/*
Select a site and describe fields, methods, and entities. Please provide a link to the site.
The site must contain decent content.
https://music.youtube.com
 */

public class Artist {

    private String name;
    private Genre genre;
    private String link;
    private String artistInfo;
    private static int artistId = 0;

    public Artist(String name, Genre genre, String link, String artistInfo) {
        this.name = name;
        this.genre = genre;
        this.link = link;
        this.artistInfo = artistInfo;
        this.artistId = getArtistId();
    }

    public void getSimilarArtists(){
        //TODO some logic depends on genre of music
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getLink() {
        return link;
    }

    public String getArtistInfo() {
        return artistInfo;
    }

    public static int getArtistId() {
        return artistId++;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", link='" + link + '\'' +
                ", artistInfo='" + artistInfo + '\'' +
                '}';
    }
}
