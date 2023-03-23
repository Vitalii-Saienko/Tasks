package Practise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeTask3 {
/*
Написать метод ,который генерирует числа( 20 штук диапозоном до 20 ) ///принимает число Х
Дан лист элементов рандомных,надо пройтись по листу и вернуть лист ,
который содержит нужные последовательности чисел ,которые в сумме дают Х
и вывести длину минимальной последовательности
 */
    public static void main(String[] args) {
        System.out.println(findElementsEqualsToInput(10));
    }
    static int sumElements (List <Integer> inputList){
        int sum = 0;
        for (int i = 0; i < inputList.size(); i++) {
            sum = sum + inputList.get(i);
        }
        return sum;
    }
    static ArrayList<ArrayList<Integer>> findElementsEqualsToInput (int number){
        ArrayList<ArrayList<Integer>> answerList = new ArrayList<ArrayList<Integer>>();
        ArrayList <Integer> myList = new ArrayList<>(20);
        //заполняем
        for (int i = 0; i < 20; i++) {
            myList.add(new Random().nextInt(20));
        }
        System.out.println(myList);
        //ищем последовательности
        int start = 0;
        int end = start + 2;

        for (int i = 0; i < myList.size()-1; i++) {
            List<Integer> temporary = myList.subList(start,end);
            //System.out.println("i: " + i + " start:" + start + " ,end: " + end + " ,list:" + temporary + ",sum:" + sumElements(temporary));
            if (sumElements(temporary) < number){
                end++;
            }
            if (sumElements(temporary) == number){
                answerList.add(new ArrayList<>(temporary));
                start++;
                end = start + 2;
            }
            if (sumElements(temporary) > number){
                start++;
                end = start + 2;
            }
        }
        //ищем минимальную длинну
        int minSize = answerList.isEmpty() ? 0 : Integer.MAX_VALUE;
        for (ArrayList<Integer> innerList : answerList) {
            int size = innerList.size();
            if (size < minSize) {
                minSize = size;
            }
        }
        System.out.println("Min.length is: " + minSize);
        return answerList;
    }
}
