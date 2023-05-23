package Practise14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String text = "The Statue of Liberty, arguably one of New York City’s most iconic symbols, is a popular tourist attraction for first-time visitors to the city. This 150-foot monument was gifted to the United States from France in order to celebrate 100 years of America’s independence. The statue is located on Liberty Island, and it is accessible by taking a ferry from either Battery Park in New York City or Liberty State Park in Jersey City.";
        String pattern = "\\bLiberty\\b";
        /*
            \\b - обозначает границу слова (word boundary), что означает, что искомое слово должно быть отделено
            от других символов, таких как пробелы, знаки препинания и др.
         */

        Pattern myPattern = Pattern.compile(pattern);
        Matcher myMatcher = myPattern.matcher(text);

        int counter = 0;
        int start = -1;
        int end = -1;
        String groupMethodResult = "";

        while (myMatcher.find()){
            counter++;
            start = myMatcher.start();
            end = myMatcher.end();
            groupMethodResult = myMatcher.group();
        }
        System.out.println("repeat times: " + counter);
        System.out.println("index of last start: " + start);
        System.out.println("index of last end: " + end);
        System.out.println(groupMethodResult);


    }
}
