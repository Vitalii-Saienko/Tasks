package Practise9;
/*

     * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10);
     * + Фильтрация списка на нечетные числа
     * + Определение максимального значения в списке
     * + Получение среднего значения списка целых чисел
     * + Нахождение суммы чисел, кратных 3 и 5, из списка чисел
     * + Поиск наибольшей длины последовательности из уникальных чисел в списке
     *
     *   List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
     * + Преобразование списка строк в список чисел
     *
     *   List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
     * + Фильтрация списка строк на те, которые начинаются с 'a' и преобразование их в верхний регистр
     * + Получение списка уникальных слов из списка строк, длина которых больше 4 символов
     *
     *   List<Task10Person> people = Arrays.asList(new Task10Person("John", 25), new Task10Person("Alice", 22), new Task10Person("Bob", 30));
     *   List<String> names = people.stream()
     * - Преобразование списка объектов класса в список их имен, отсортированных по возрасту
    class Task10Person {
    private String name;
    private int age;
}

 */

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {
        int[] arr = {1, 20, 20, 30, 30, 4, 4};
        System.out.println(isDuplicate2(arr));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15);
        List<Integer> numbers2 = filterNotEven(numbers);
        System.out.println(numbers);
        System.out.println("task1: " + numbers2);
        System.out.println("task2: " + findMax(numbers));
        System.out.println("task3: " + findAverage(numbers));
        System.out.println("task4: " + findSumOfMultiplesThreeAndFive(numbers));
        List<Integer> numbers3 = Arrays.asList(1,2,3,4,4,5,6,6,7,8,9,10,11,12,13,14,14);
        System.out.println("task5: " + findMaxLengthOfUniqueOrder(numbers3));
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        System.out.println("task6: " + convertStrToIntList(strings));
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
        System.out.println("task7: " + filterAndConvertToUpperCaseStartingWithA(words));
        System.out.println("task8: " + getUniqueWordsWithLengthGreaterThan4(words));

    }


    //task1:Filtering a list for odd numbers
    public static List<Integer> filterNotEven(List<Integer> arrayList) {
        return arrayList.stream()
                .filter(x -> x % 2 != 0).toList();
    }

    //task2:Find max from list
    public static int findMax(List<Integer> list) {
        return list.stream()
                .max(Integer::compare)
                .get();
    }

    //task3:Find average from list
    public static double findAverage(List<Integer> list) {
        return list.stream().
                mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }

    //task4: Finding the sum of multiples of 3 and 5 from a list of numbers
    public static int findSumOfMultiplesThreeAndFive(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 3 == 0 && x % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
    //task5: Finding the length of the longest sequence of unique numbers in a list
    public static int findMaxLengthOfUniqueOrder(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list);
        List<Integer> lengths = new ArrayList<>();
        int counter = 1;
        int i = 1;
        while (newList.iterator().hasNext()) {
            if (!newList.get(i).equals(newList.get(i-1))) {
                counter++;
            }
            if (newList.get(i).equals(newList.get(i-1)) || i == (newList.size()-1)) {
                lengths.add(counter);
                counter = 1;
            }
            i++;
            if (i == newList.size()){
                break;
            }
        }
        return findMax(lengths);
    }
    //task6: return Integer list from input String list
    public static List <Integer> convertStrToIntList (List<String> inputList){
        Function <String, Integer> function = (Integer::valueOf);
        List <Integer> integerList = new ArrayList<>();
        integerList = inputList.stream()
                .map(function)
                .collect(Collectors.toList());
        return integerList;
    }
    //task7:filter the list of strings to those that start with 'a' and convert them to upper case
    public static List<String> filterAndConvertToUpperCaseStartingWithA (List <String> inputList){
        Predicate <String> function = (elem->elem.charAt(0)=='a');
        return inputList.stream()
                .filter(function)
                .map(String::toUpperCase)
                .toList();
    }
    //task8: get unique words from list which length greater than 4
    public static List<String> getUniqueWordsWithLengthGreaterThan4 (List<String> inputList){
        Predicate <String> function = (elem->elem.length()>4);
        return inputList.stream()
                .filter(function)
                .toList();
    }
    //task0: find unique number in array
    public static boolean isDuplicate2(int[] array) {
        int[] newArr = Arrays.stream(array).distinct().toArray();
        int size = newArr.length;
        return !(array.length == newArr.length);
    }
}
