package Practise11;

public class Books {
    String title;

    public String getAuthor() {
        return author;
    }

    String author;
    int year;

    public Books(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}
