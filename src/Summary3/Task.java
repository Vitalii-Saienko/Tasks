package Summary3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Task {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Dob", "Rob", "Kob");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Student " + names.get(i));
        }

        findName(names, "R");
        findName2(names, 1);
    }
    public static List<String> findName(List list, String symbol){
        List<String> names = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String currentName = list.get(i).toString();
            String letter = String.valueOf(currentName.charAt(0));
            if (Objects.equals(letter, symbol)) {
                names.add((String) list.get(i));
            }
        }
        System.out.println(names);
        return names;
    }

    public static void findName2(List list, int n){
        List<String> names = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String currentName = list.get(i).toString();
            String length = String.valueOf(currentName.length());
            if (currentName.length() > n) {
                names.add(currentName.toUpperCase());
            }
        }
        System.out.println(names);
    }
}
