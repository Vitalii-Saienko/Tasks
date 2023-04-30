package Summary5;

import java.util.Stack;

/*
https://github.com/tel-ran-de/java48m/tree/main/src/main/java/lessons/lesson12

Реализовать систему, которая проверяет правильность расстановки скобок в строке. Необходимо использовать коллекцию
Stack в Java для реализации алгоритма.
"()"; // Правильное расположение скобок
"([{}])"; // Правильное расположение скобок
String input3 = "({[]})"; // Правильное расположение скобок
String input4 = "({[})"; // Неправильное расположение скобок
"( { [ } ) " ; // Неправильное расположение скобок

 */
public class CheckString {
    public static void main(String[] args) {
        Stack <String> vit = new Stack<>();
        vit.add("(");
        vit.add(")");
        System.out.println(vit);
        System.out.println(vit.peek());
    }
}
