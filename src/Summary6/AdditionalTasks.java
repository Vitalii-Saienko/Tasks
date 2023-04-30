package Summary6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class AdditionalTasks {

    public static void main(String[] args) {
        //1. Count the number of unique words in a list
        List<String> names = new ArrayList<>(Arrays.asList("Bob", "Tim", "Jim", "Stuart", "Jim", "John", "Tim", "Andrew"));
        long uniqueNames = names.stream()
                .distinct()
                .count();
        System.out.println(uniqueNames);

        //2. Count names equal "Tom"
        long namesTom = names.stream()
                .filter(elem->elem.equals("Tom"))
                .count();
        System.out.println(namesTom);

        //3. Get first name in natural order sort
        String firstOrderedName = names.stream()
                .sorted()
                .findFirst()
                .get();
        System.out.println(firstOrderedName);

        //4. Count quantity of numbers from 1 to 1000, which can be divided by 7 without a remainder.
        List <Integer> integerList = new ArrayList<>(1500);
        for (int i = 1; i <= 1500; i++) {
            integerList.add(i);
        }
        int countNumbers = (int) integerList.stream()
                .filter(elem->elem >= 1 && elem <= 1000 && elem % 7 == 0)
                .count();
        System.out.println(countNumbers);

        //5. Sum of squares from 1 to 10
        List <Integer> integerList2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int squaresSum = integerList2.stream()
                .map(elem->elem*elem)
                .reduce(Integer::sum)
                .get();
        System.out.println(squaresSum);

        //6. get abbreviation S.M.A.R.T.
        List <String> listWords = new ArrayList<>(Arrays.asList("Specific","Measurable","Achievable","Relevant","Time-bound"));
        String abbreviation = listWords.stream()
                .map(elem->elem.substring(0,1))
                .map(elem->elem.concat("."))
                .reduce(String::concat)
                .orElse("");
        System.out.println(abbreviation);
    }
}
