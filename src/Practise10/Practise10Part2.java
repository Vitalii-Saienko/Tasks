package Practise10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Practise10Part2 {
    Task10Person personPr10;

    public static void main(String[] args) {
        //Дан список целых чисел. Напишите программу, которая вычисляет сумму нечетных чисел в списке.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int answer = numbers.stream()
                .filter(el->el % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("task1: " + answer);

        //Дан список строк. Напишите программу, которая находит самую длинную строку в списке.
        List<String> strings = Arrays.asList("Java", "Python", "C++", "Ruby", "JavaScript", "PHP");
        String answer2 = Collections.max(strings, Comparator.comparingInt(String::length));
        System.out.println("task2: " + answer2);

        //Дан список объектов класса Task10Person, у которых есть поля name и age.
        // Напишите программу, которая находит всех людей старше 25 лет и сортирует их по имени в алфавитном порядке.
        List<Task10Person> people = Arrays.asList(
                new Task10Person("Abb", 30),
                new Task10Person("Bob", 20),
                new Task10Person("Charlie", 25),
                new Task10Person("David", 35),
                new Task10Person("Eve", 28),
                new Task10Person("Ann", 18),
                new Task10Person("Aab", 30));
        List <Task10Person> peopleAnswer = people.stream()
                .filter(Task10Person -> Task10Person.getAge() > 25)
                .sorted(Comparator.comparing(Task10Person::getName))
                .toList();
        System.out.println("task3: " + peopleAnswer);

//        Дан список целых чисел. Напишите программу, которая находит максимальный элемент в списке и умножает его на 2.
        List<Integer> numbers4 = Arrays.asList(1, 5, 10, 15, 20);
        int maxMultTwo = numbers4.stream()
                .max(Comparator.naturalOrder())
                .map(l->l*2)
                .get();
        System.out.println("task4: " + maxMultTwo);
// Дан список строк. Напишите программу, которая находит все строки, которые начинаются с буквы "J" и заканчиваются на букву "a", и выводит их в консоль.
        List<String> strings2 = Arrays.asList("Java", "JavaScript", "Python", "Ruby", "JavaFX", "Scala");
        System.out.println("task5:");
        strings2.stream()
                .filter(s -> s.startsWith(String.valueOf('J')) && s.endsWith(String.valueOf('a')))
                .forEach(System.out::println);
    }
}
//далее в телеге от 3.05

