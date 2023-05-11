package Practise11;

import java.util.*;
import java.util.stream.Collectors;

public class Practise11 {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        cityList.add("Kyiv,100");
        cityList.add("London,500");
        cityList.add("Berlin,800");
        cityList.add("Kharkov,150");
        cityList.add("Barcelona,100");
        System.out.println(getTOPNСities(cityList, 3));

        System.out.println("------");

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        printMinAndMax(integerList);

        System.out.println("------");

        List<String> list = Arrays.asList("Ab", "bah", "art", "jij", "lop");
        System.out.println(stringsWithA(list));

        System.out.println("------");

        Person11 person1 = new Person11("Bob", 10);
        Person11 person2 = new Person11("Bob", 20);
        Person11 person3 = new Person11("Bob", 30);
        List<Person11> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        System.out.println(getAverageAge(people));

        System.out.println("------");

        List<Books> booksList = new ArrayList<>();
        booksList.add(new Books("how to code", "Bill Bobs", 2000));
        booksList.add(new Books("how to survive in IT", "Bill Bobs", 2000));
        booksList.add(new Books("how to avoid colleagues", "Steve Introvert", 2000));
        booksList.add(new Books("how to work without colleagues", "Steve Introvert", 2000));
        booksList.add(new Books("how to earn money without working", "Bruce Lees", 2000));
        booksList.add(new Books("how to do something", "Random Guy", 2000));
        System.out.println(getAuthorWithMostWrittenBooks(booksList));
    }


    /**
     * Дан список строк, каждая строка
     * содержит название города и его население в тысячах человек,
     * разделенных запятой. Необходимо найти топ N городов с
     * наибольшим населением. Напишите метод, который принимает
     * список строк и число N и возвращает список топ N городов.
     * String str = "New-York,10000"
     * <p>
     * 8-10
     */
    public static List<String> getTOPNСities(List<String> cities, int n) {
        Map<String, Integer> cityPopulation = cities.stream()
                .map(string -> string.split(","))
                .collect(Collectors.toMap(
                        elem -> elem[0],
                        elem -> Integer.parseInt(elem[1])
                ));

        List<String> topCities = cityPopulation.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(n)
                .map(Map.Entry::getKey)
                .toList();
        return topCities;
    }

    /**
     * Дан список целых чисел.
     * Найдите минимальное и максимальное значения в списке и выведите их на консоль.
     * 5-10
     */
    public static void printMinAndMax(List<Integer> integerList) {
        int max = integerList.stream()
                .max(Integer::compareTo)
                .get();
        int min = integerList.stream()
                .min(Integer::compareTo)
                .get();
        System.out.println("max is: " + max + ", min is: " + min);
    }

    /**
     * Дан список строк. Найдите все строки, которые начинаются с буквы "A",
     * отсортируйте их по алфавиту и выведите на консоль.
     * 6-10
     */
    public static List<String> stringsWithA(List<String> inputList) {
        return inputList.stream()
                .filter(elem -> elem.startsWith("A"))
                .toList();
    }

    /**
     * Дан список объектов класса Person,
     * содержащих поля name и age.
     * Найдите средний возраст всех людей в списке и выведите его на консоль.
     * 7-10
     */
    public static double getAverageAge(List<Person11> people) {
        return people.stream()
                .mapToInt(elem -> elem.age)
                .average()
                .orElse(0.0);
    }

    /**
     * Дана коллекция объектов класса Book, содержащая поля title,
     * author и year. Напишите метод, который находит автора,
     * написавшего наибольшее количество книг. Если таких авторов несколько,
     * то вернуть список их имен.
     * <p>
     * 9-10
     */
    public static List<String> getAuthorWithMostWrittenBooks(List<Books> booksList) {
        HashMap<String, Long> authors = booksList.stream()
                .collect(Collectors.toMap(
                        books -> books.getAuthor(),
                        elem -> 1L,
                        (count1, count2) -> count1 + 1,
                        HashMap::new));

        long maxRepeat = Collections.max(authors.values());

        return authors.entrySet().stream()
                .filter(elem -> elem.getValue() == maxRepeat)
                .map(Map.Entry::getKey)
                .toList();
    }
}
