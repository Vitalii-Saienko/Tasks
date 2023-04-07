package Practise6;

import java.util.List;

public class GameDemo {
    public static void main(String[] args) {
        LeagueYouth leagueYouth = new LeagueYouth("Young generation");
        List<Player<LeagueYouth>> leagueYouthList = PlayerGenerator.generateListOfPlayers(leagueYouth);
        GameCore.playLeagueTournament(leagueYouthList, leagueYouth);

        System.out.println();

        LeagueAdult leagueAdult = new LeagueAdult("Adult PRO");
        List<Player<LeagueAdult>> leagueAdultList = PlayerGenerator.generateListOfPlayers(leagueAdult);
        GameCore.playLeagueTournament(leagueAdultList, leagueAdult);

        System.out.println();

        LeagueVeterans leagueVeterans = new LeagueVeterans("Old guys");
        List<Player<LeagueVeterans>> veteransList = PlayerGenerator.generateListOfPlayers(leagueVeterans);
        GameCore.playLeagueTournament(veteransList, leagueVeterans);
    }
}


