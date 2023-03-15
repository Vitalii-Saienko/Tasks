package Practise2;
/*
Select a site and describe fields, methods, and entities. Please provide a link to the site.
The site must contain decent content.
https://music.youtube.com
 */
import java.util.List;

public class Genre {
    private String name;
    private static int genreId = 0;
    List<Genre> genres;

    public Genre(String name, List<Genre> genres) {
        this.name = name;
        this.genres = genres;
    }

    public static int getGenreId() {
        return genreId++;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                ", genres=" + genres +
                '}';
    }
}
