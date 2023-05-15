package Practise13;

public class Match {
    String year;
    String month;
    String day;
    String team1;
    String team2;
    String score;

    public Match(String year, String month, String day, String team1, String team2, String score) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.team1 = team1;
        this.team2 = team2;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Match{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
