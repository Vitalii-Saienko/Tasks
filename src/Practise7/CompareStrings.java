package Practise7;


import java.util.ArrayList;
import java.util.List;

public class CompareStrings {

    public static void main(String[] args) {

        System.out.println("1 " + compareStrings("java##", "ja"));
        System.out.println("2 " + compareStrings("##java", "java"));
        System.out.println("3 " + compareStrings("ja#va#", "jv"));
        System.out.println("4 " + compareStrings("ja#va###", ""));
    }

    public static boolean compareStrings (String one, String two){
        return ((modifyString(one)).equals(two));
    }

    private static String modifyString(String one) {
        List<Character> chars = new ArrayList<>();
        for (char c : one.toCharArray()) {
            chars.add(c);
        }
        while (chars.contains('#')){
            removeRange(chars);
        }
        StringBuilder builder = new StringBuilder(chars.size());
        for (Character ch : chars) {
            builder.append(ch);
        }
        return String.valueOf(builder);
    }

    private static void removeRange(List<Character> chars) {
        if (chars.get(0).equals('#')){
            chars.remove(0);
        }
        for (int i = chars.size()-1; i > 0; i--) {

            if (chars.get(i).equals('#') && !chars.get(i-1).equals('#') ){
                chars.remove(i);
                chars.remove(i-1);
                i -= 2;
            }
        }
    }
}
