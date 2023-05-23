package Practise14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TasksRegEx {
    public static void main(String[] args) {
        //найти 7 последовательных цифр
        String text = "dffdh1111111dgs2222222f3333333";
        String pattern = "\\d{7}";
        Pattern myPattern = Pattern.compile(pattern);
        Matcher myMatcher = myPattern.matcher(text);
        boolean answer = myMatcher.matches(); //совпадает ли полностью вся строка условию
        System.out.println("совпадает ли полностью вся строка условию: " + answer);
        boolean answer2 = myMatcher.find(); //есть ли совпадение, если без цикла то только ПЕРВОЕ!
        System.out.println("есть ли совпадение: " + answer2);
        String answer3 = myMatcher.group(); //При каждом вызове group() возвращается текущее совпадение
        // в соответствии с текущей позицией указателя Matcher.
        System.out.println("текущее совпадение: " + answer3);

        while (myMatcher.find()){
            System.out.println("нашло в цикле совпадение: " + myMatcher.group());
        }
    }
}
