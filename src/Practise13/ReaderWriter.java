package Practise13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderWriter {
    public static void main(String[] args) {
        List<Match> matches= readFile("C:/Users/hp/IdeaProjects/Tasks/src/Practise13/matchesTable");
        for (Match match:matches) {
            System.out.println(match);
        }
    }

    public static List<Match> readFile(String filepath) {

        List<Match> matches = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] matchInfo = line.split(",");
                String year = matchInfo[0];
                String month = matchInfo[1];
                String day = matchInfo[2];
                String team1 = matchInfo[3];
                String team2 = matchInfo[4];
                String score = matchInfo[5];

                Match match = new Match(year, month, day, team1, team2, score);
                matches.add(match);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matches;
    }
}
