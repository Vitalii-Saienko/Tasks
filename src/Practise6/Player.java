package Practise6;


public class Player<T extends League> {
    String name;
    int age;
    int scores;
    T league;

    public Player(String name, int age, int scores, T league) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.league = league;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getScores() {
        return scores;
    }

}
