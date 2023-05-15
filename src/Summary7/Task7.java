package Summary7;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Task7 {
    public static void main(String[] args) {
        String quotes = "Life is like riding a bicycle. To keep your balance, you must keep moving.";
        String[] arrayQuotes = quotes.split("\\P{L}+");
        System.out.println(Arrays.toString(arrayQuotes));

        //общее количество слов
        long words = Arrays.stream(arrayQuotes).count();
        System.out.println("task1: " + words);

        //кол-во уникальных слов
        long uniqueWords = Arrays.stream(arrayQuotes).distinct().count();
        System.out.println("task2: " + uniqueWords);

        //список уникальных букв
        List <Character> integerList = Arrays.stream(arrayQuotes)
                .flatMap(el-> el.chars().mapToObj(value -> (char) value))
                        .map(Character::toLowerCase)
                        .distinct()
                        .sorted()
                        .toList();
        System.out.println("task3: " + integerList);

        //количество уникальных букв
        System.out.println("task4: " + integerList.size());





    }
}
