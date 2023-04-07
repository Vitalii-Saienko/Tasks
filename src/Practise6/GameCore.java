package Practise6;

import java.util.*;

public class GameCore<T extends League> {
    private static <T extends League> void game(List<Player<T>> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < i; j++) {
                simulation(arrayList.get(i), arrayList.get(j));
            }
        }
    }

    private static <T extends League> void simulation(Player<T> player, Player<T> player2) {
        Random random = new Random();
        int goalsPlayer = random.nextInt(3);
        int goalsPlayer2 = random.nextInt(3);
        System.out.println(player + " " + goalsPlayer + " : " + goalsPlayer2 + " " + player2);
        if (goalsPlayer > goalsPlayer2) {
            player.scores = player.scores + 2;
        } else if (goalsPlayer < goalsPlayer2) {
            player2.scores = player2.scores + 2;
        } else {
            player.scores++;
            player2.scores++;
        }
    }

    private static <T extends League> void printResults(List<Player<T>> arrayList, League league) {
        Collections.sort(arrayList, new ScoreComparator());
        System.out.println("Tournament table results:");
        for (Player element : arrayList) {
            System.out.println(element.name + " " + element.scores + " (points)");
        }
        if (arrayList.get(0).scores > arrayList.get(1).scores) {
            System.out.println("* * * " + arrayList.get(0) + " is the CHAMPION of " + league.getLeagueName() + " league! * * *");
        } else {
            System.out.println("There are a few leaders. Leaders join next round. Let's go!");
        }
    }

    private static <T extends League> int findMaxScore(List<Player<T>> arrayList) {
        int maxScore = 0;
        for (Player element : arrayList) {
            if (element.scores > maxScore) {
                maxScore = element.scores;
            }
        }
        return maxScore;
    }

    private static <T extends League> List<Player<T>> getFewLeadersFinalRound(List<Player<T>> arrayList) {
        List<Player<T>> secondRoundArrayList = new ArrayList<>();
        int maxScore = findMaxScore(arrayList);
        for (Player element : arrayList) {
            if (element.scores == maxScore) {
                secondRoundArrayList.add(element);
            }
        }
        if (secondRoundArrayList.size() == 1) {
            secondRoundArrayList.clear();
        }
        return secondRoundArrayList;
    }

    private static <T extends League> boolean isOneWinner(List<Player<T>> arrayList) {
        return getFewLeadersFinalRound(arrayList).isEmpty();
    }

    private static <T extends League> void playSecondRound(List<Player<T>> arrayList) {
        game(getFewLeadersFinalRound(arrayList));
    }

    static <T extends League> void playLeagueTournament(List<Player<T>> arrayList, League league) {
        System.out.println("* * * Matches in League " + league.leagueName + " * * *");
        game(arrayList);
        System.out.println("-----------------");
        printResults(arrayList, league);
        System.out.println("-----------------");
        boolean flag = false;
        if (!isOneWinner(arrayList)) {
            while (!flag) {
                List<Player<T>> arrayListFinalStage = getFewLeadersFinalRound(arrayList);
                playSecondRound(arrayListFinalStage);
                printResults(arrayListFinalStage, league);
                if (isOneWinner(arrayListFinalStage)) {
                    flag = true;
                }
            }
        }
    }
}
