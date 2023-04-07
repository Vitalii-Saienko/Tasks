package Practise6;

import java.util.*;

public class PlayerGenerator {

    private static <T extends League> Player<T> generateSinglePlayer(T league) {
        Random random = new Random();
        int age = 16;
        if (league.getClass() == LeagueYouth.class){
            age = random.nextInt(9)+16;
        } else if (league.getClass() == LeagueAdult.class) {
            age = random.nextInt(14)+26;
        } else if (league.getClass() == LeagueVeterans.class) {
            age = random.nextInt(19)+41;
        }
        String[] names = new String[]{"Drunk Master", "Drinker", "Crazy Frog", "Java Teacher", "Piece of cake", "Rembotito", "Muffin hunter", "Ekler", "Beerman", "Drunk dancer", "Big Bob", "Holiwar Man", "Ball Man", "Dirty Sock", "Jack Bird", "Iron Table", "Blind goalkeeper", "Strip dancer", "Angry cat",  "Jungle Man",  "Frog rider",  "Pizza Man",  "Moon Walker",  "Ninja",  "Alco Man",  "Head Man",  "Ice Eater",  "Bubble Gum Man",  "Firestarter",  "Mosquito",  "Rave Man",  "Liter Fly",  "Disco Storm",  "Guitar Man",  "Star Man",  "Mister Fish",  "Banana Man",  "Hate Man"};
        String name = names[random.nextInt(names.length)];
        return new Player<T>(name, age, 0, league);
    }
    protected static <T extends League> List<Player<T>> generateListOfPlayers(T league) {
        List<Player<T>> players = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            players.add(generateSinglePlayer(league));
        }
        return players;
    }
}
