package Practise5;
//task: check if word consist from give letters
import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        solutionMethod();
    }
    public static LinkedList<Character> generateRandomCharList(){
        Random random = new Random();
        LinkedList<Character> listA = new LinkedList<>();
        for (int i = 0; i < 13; i++) {
            listA.add((char)(random.nextInt(26) + 'a'));
        }
        System.out.println("Our list is:\n" + listA + "\n");
        return listA;
    }
    public static char[] inputString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word:");
        return scanner.nextLine().toCharArray();
    }
    public static boolean isWordFromLetters(LinkedList<Character> listA, char[] word){
        boolean flag = false;
        for (int i = 0; i < word.length; i++) {
            if (!listA.contains(word[i])){
                break;
            }
            else {
                listA.remove((Object) word[i]);
                flag = true;
            }
        }
        return flag;
    }
    public static void answer(boolean flag){
        System.out.println(flag ? "Success, you can create such word :) " : "sorry, you can't create such word");
    }
    public static void solutionMethod(){
        answer(isWordFromLetters(generateRandomCharList(), inputString()));
    }
}
