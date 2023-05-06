package Practise10;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Practise10 {
    public static void main(String[] args) {
        //        Найти среднее арифметическое всех элементов массива.
        //        int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {1, 2, 3, 4, 5};
        OptionalDouble stream1 = Arrays.stream(arr)
                .average();
        System.out.println("task1: " + stream1);

        //        Найти максимальный элемент в списке строк, длина которых больше 5 символов
        List<String> list = Arrays.asList("apple", "banana", "pear", "orange", "grapefruit", "orange-banana-pear");
        String answer = String.valueOf(list.stream()
                .filter(s -> s.length() > 5)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .findFirst());
        System.out.println("task2: " + answer);

//        Найти первый элемент списка, который начинается с буквы "A", или вернуть пустой Optional, если такого элемента нет.
        List<String> list2 = Arrays.asList("apple", "banana", "apricot", "orange", "avocado");
        String answer2 = list2.stream()
                .filter(s -> s.charAt(0) == 'a')
                .findFirst()
                .orElse("nothing");
        System.out.println("task3: " + answer2);

//        найти всех кто начинается с буквы "а"
        List <String> answer2_2 = list2.stream()
                .filter(s -> s.charAt(0) == 'a')
                .toList();
        System.out.println("task3_2: " + answer2_2);


//        Найти сумму квадратов всех четных чисел в массиве.
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        int answer3 = list3.stream()
                .filter(s -> s % 2 == 0)
                .mapToInt(s -> s * s)
                .sum();
        System.out.println("task4: " + answer3);

//        Найти сумму квадратов всех четных чисел в массиве типа STRING
        List<String> list3_2 = Arrays.asList("1", "2", "3", "4", "5");
        int answer3_2 = list3_2.stream()
                .map(Integer::valueOf)
                .filter(s->s % 2 == 0)
                .mapToInt(s-> s * s)
                .sum();
        System.out.println("task4_2 " + answer3_2);


//        Получить все уникальные слова из списка строк, отсортированные в алфавитном порядке.
        List<String> list4 = Arrays.asList("apple", "banana", "orange", "pear", "orange", "apple");
        list4 = list4.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("task5: " + list4);

    }
}
