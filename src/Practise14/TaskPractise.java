package Practise14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskPractise {
    public static void main(String[] args) {
        String input = "Contact us at info@example.com or support@example.com";
        System.out.println(replace(input));
        System.out.println("---------------------");
        String phoneNumber = "+1-555-123-4567";
        System.out.println("number is valid: " + check(phoneNumber));
        System.out.println("---------------------");
        String url = "https://www.example.com/path/to/page.html";
        System.out.println("URL is valid: " + isValidURL(url));
    }
    /**
     * Задача 1 (Сложность 4/10):
     * Найти и заменить все email адреса в строке на "REDACTED".
     */

    private static String replace(String input) {
        String replacement = "REDACTED";
        String emailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        Pattern myPattern = Pattern.compile(emailPattern);
        Matcher myMatcher = myPattern.matcher(input);
        while (myMatcher.find()){
            input = input.replace(myMatcher.group(), replacement);
        }
        return input;
    }

    /**
     * Задача 2 (Сложность 6/10):
     * Проверить, является ли строка валидным номером телефона
     * в формате "+X-XXX-XXX-XXXX", где X - цифра.
     */

    //String phoneNumber = "+1-555-123-4567";
    private static boolean check(String phoneNumber) {
        String phonePattern = "\\+\\d{1}-\\d{3}-\\d{3}-\\d{4}";
        Pattern myPattern = Pattern.compile(phonePattern);
        Matcher myMatcher = myPattern.matcher(phoneNumber);
        return myMatcher.matches();
    }

    /**
     * Задача 3 (Сложность 8/10):
     * Проверить, является ли строка валидным URL-адресом,
     * начинающимся с "http://" или "https://",
     * и содержащим доменное имя и путь.
     */

    // String url = "https://www.example.com/path/to/page.html";
    private static boolean isValidURL(String URL) {
        String urlPattern = "^(http|https)://.*$";
        Pattern myPattern = Pattern.compile(urlPattern);
        Matcher myMatcher = myPattern.matcher(URL);
        return myMatcher.matches();
    }
}
