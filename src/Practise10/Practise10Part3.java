package Practise10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practise10Part3 {
    public static void main(String[] args) {
        String[] stringArray = {
                "this is line",
                "111 this this line that contains numbers 123",
                "123456",
                "123"
        };
        System.out.println("task1: " + findNumberInString(stringArray));
        System.out.println("task1 way2: " + findNumberInString2(stringArray));

        String filePath =  "C:/Users/hp/IdeaProjects/Tasks/src/Practise10/TextWithBadWords";
        textEditor(filePath);
    }
    // Написать программу на Java, которая на вход получает массив строк и проверяет,
    // есть ли среди них хотя бы одна строка, содержащая только цифры.
    // Если есть, то программа должна вернуть эту строку, иначе - вернуть null.
    public static String findNumberInString (String[] array){
        String answer = null;
        for (String s : array) {
            if (checkIsConvertible(s)) {
                answer = s;
                break;
            }
        }
        return answer;
    }

    private static boolean checkIsConvertible(String s) {
        try {
            return Integer.parseInt(s) * 2 == Integer.parseInt(s) * 2;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static String findNumberInString2(String[] array) {
        return Arrays.stream(array)
                .filter(s -> s.matches("\\d+"))
                .findFirst()
                .orElse(null);
    }

    // написать программу на Java, которая считывает текстовый файл,
    // заменяет в нем все вхождения слова "bad-word" на слово "вырезано цензурой" и сохраняет изменения в тот же файл
    // path format: "path/to/file.txt";
    public static void textEditor (String filePath){
        List <String> text = readTextFromFile(filePath);
        text = editText (text);
        rewriteFile (text, filePath);
    }

    private static void rewriteFile(List<String> text, String filePath) {
        try {
            String content = String.join(System.lineSeparator(), text);
            Files.write(Paths.get(filePath), content.getBytes());
        } catch (IOException e) {
            System.out.println("Error during file writing");;
        }
    }

    private static List<String> editText(List<String> text) {
        return text.stream()
                .map(l->l.replaceAll("BADWORD", "[CENSORED]"))
                .toList();
    }

    private static List<String> readTextFromFile(String filePath) {
        List <String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            System.out.println("Error in readTextFromFile");
        }
        return text;
    }
}
