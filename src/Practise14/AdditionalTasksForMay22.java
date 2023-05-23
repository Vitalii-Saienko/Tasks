package Practise14;

import Practise13.Match;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdditionalTasksForMay22 {
    public static void main(String[] args) throws IOException {
        String task1 = "__";
        System.out.println("is variable name: " + task1 + " valid: " + isValid(task1));
        String task2 = "500.168.0.1";
        System.out.println("is IP " + task2 + " valid: " + isValidIP(task2));
        String task3 = "Some text with dates: 01-01-2022, 31-12-2023, 15-02-2024";
        findDate(task3);
        String task4 = "<li><a href=\"https://dou.ua/forums/\">Форум</a></li>";
        pars(task4);
        String task4Extra = "C:/Users/hp/IdeaProjects/Tasks/src/Practise14/html.txt";
        readAndParsFromFile(task4Extra);
    }
    //https://github.com/Shonmikl/Eklers/blob/master/src/_2023_05_17/RegexTask.java
    /**
     * Задача с уровнем сложности 4:
     * Напишите программу на Java, которая будет проверять,
     * является ли заданная строка допустимым именем переменной.
     * Допустимые имена переменных должны начинаться с буквы или
     * знака подчеркивания, а затем могут содержать любую комбинацию
     * букв, цифр и знаков подчеркивания. Минимальная длина имени
     * переменной должна быть 2 символа.
     */

    private static boolean isValid(String variableName) {
        String pattern = "^[a-zA-Z_][a-zA-Z0-9_]{1,}$";
        Pattern myPattern = Pattern.compile(pattern);
        Matcher myMatcher = myPattern.matcher(variableName);
        return myMatcher.find();
    }
    /**
     *  Задача 1 (Уровень сложности: 5)
     *  Проверить, является ли строка действительным IP-адресом формата IPv4.
     *  String ipAddress = "192.168.0.1";
     *  Валидные IP-адреса IPv4 должны соответствовать следующим правилам:
     *  Иметь четыре числовых блока, разделенных точками.
     *  Каждый блок должен быть целым числом от 0 до 255.
     *  Не должно быть ведущих нулей в каждом блоке, за исключением случая, когда блок равен нулю
     */
    private static boolean isValidIP(String IP) {
        String pattern = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern myPattern = Pattern.compile(pattern);
        Matcher myMatcher = myPattern.matcher(IP);
        return myMatcher.find();
    }
    /**
     * Задача 2 (Уровень сложности: 7)
     * Найти все даты в формате "DD-MM-YYYY" в заданной строке.
     * String text = "Some text with dates: 01-01-2022, 31-12-2023, 15-02-2024";
     */
    private static void findDate(String text) {
        String pattern = "\\b[0-3][0-9]-[0-1][0-9]-[0-9]{4}\\b";
        Pattern myPattern = Pattern.compile(pattern);
        Matcher myMatcher = myPattern.matcher(text);
        while (myMatcher.find()){
            System.out.println("following dates have been found: " + myMatcher.group());
        }
    }
    /**
     * Задача с уровнем сложности 10:
     * Напишите программу на Java, которая
     * будет парсить и анализировать структуру
     * HTML-документа. Вам нужно найти все ссылки
     * (<a> теги) в HTML-коде и вывести их атрибуты
     * href и текст ссылки.
     *<a href="https://www.example.com">Это ссылка на example.com</a>
     */
    private static void pars(String html) {
        Pattern LINK_PATTERN = Pattern.compile("<a\\s+(?:[^>]*?\\s+)?href=\"([^\"]*)\"[^>]*>(.*?)</a>", Pattern.CASE_INSENSITIVE);
        Matcher myMatcher = LINK_PATTERN.matcher(html);
        while (myMatcher.find()){
            String href = myMatcher.group(1);
            String linkText = myMatcher.group(2);
            System.out.println("Href: " + href + ", text: " + linkText);
        }
    }
    private static void readAndParsFromFile (String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = reader.readLine()) != null) {
                pars(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Написать программу, которая ищет все файлы определенного расширения
     * на вашем компьютере //.pdf .mp3
     *
     */
    private static void fileSearch(String dom) {

    }

}
