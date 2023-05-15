package Practise13;

import Practise12.Order12;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AdditionalHomeTask {
    public static void main(String[] args) {
        String[][] words = {{"apple", "orange", "pear", "orange"},
                {"orange", "pear", "pear", "apple"},
                {"apple", "orange", "orange", "pear"},
                {"orange", "pear", "apple", "pear"}};
        List<String> answerTask1 = findUniqueWordsBasedOnFrequency(words);
        System.out.println(answerTask1);
        HashMap <String, Integer> checkTask1 = findWordAndCounter(words);
        System.out.println(checkTask1);

        System.out.println("-------------------------");

        String[][] data = {
                {"name1", "10", "20", "30"},
                {"name2", "40", "50", "not a number"},
                {"name3", "60", "70", "80"}
        };
        List<Double> answer = findAverageInColumn(data);
        System.out.println(answer);
    }
    /**
     * Дан двумерный массив строк, необходимо выбрать
     * все уникальные слова из массива и вернуть отсортированный
     * список слов в порядке убывания частоты их появления в массиве.
     */
    public static List<String> findUniqueWordsBasedOnFrequency(String[][] wordsArray){
        return Arrays.stream(wordsArray)
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(elem->elem, Collectors.summingInt(value -> 1)))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
    //to check findUniqueWordsBasedOnFrequency write method that print words frequency
    public static HashMap<String, Integer> findWordAndCounter(String[][] wordsArray) {
        return Arrays.stream(wordsArray)
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(elem -> elem, HashMap::new, Collectors.summingInt(value -> 1)));
    }

    /**
     * Есть двумерный массив строк, представляющий таблицу данных,
     * где первый столбец - это имена, а остальные столбцы -
     * это числовые значения. Вам нужно написать программу,
     * которая найдет среднее значение для каждого числового
     * столбца, игнорируя строки, которые не могут быть преобразованы в числа.
     */
    public static List<Double> findAverageInColumn (String[][] array){
        List<Double> answer = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        for (int i = 1; i <= array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                //System.out.println("checking " + array[j][i]);
                if (isNumeric(array[j][i])){
                temp.add(array[j][i]);}
            }
            //System.out.println(temp);
            answer.add(generateAverageInteger(temp));
            temp.clear();
        }
        return answer;
    }

    private static Double generateAverageInteger(List<String> temp) {
        return temp.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .orElse(0.0);
    }
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
