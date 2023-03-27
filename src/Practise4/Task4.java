package Practise4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task4 {
    //check is word a palindrome using iterator
    public static void main(String[] args) {
        String teacher = "MikhailliahkiM";

        List <Character> listName = new ArrayList<Character>();
        for (char letter: teacher.toCharArray()) {
            listName.add(letter);
        }

        ListIterator<Character> listIterator = listName.listIterator();
        boolean answer = false;
        for (int i = 0; i < listName.size()/2; i++) {
            Character c = listIterator.next(), c2 = listIterator.previous();
            if (!c.equals(c2)){
                break;
            }
            else {
                answer = true;
            }
        }
        System.out.println("The word '" + teacher + "' is palindrome - " + answer);
    }
}
