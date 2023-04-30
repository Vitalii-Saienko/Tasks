package Summary6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Person {
    public static void main(String[] args) {
    /*
    Создать Supplier, который генерирует случайные значения типа Integer
    */
        Random random = new Random();
        Supplier<Integer> taskOne = random::nextInt;
        System.out.println("task1: " + taskOne.get());

        /*
    Создать BiFunction, которая возводит первый аргумент типа int в степень второго аргумента типа int
     */
        BinaryOperator<Integer> taskTwo = (a, b) -> (int) Math.pow(a, b);
        System.out.println("task2: " + taskTwo.apply(2, 3));

        /*
    Создать функцию, которая обрезает входную строку до 5 символов, делает их upper case
и добавляет ____ в конец.
     */
        UnaryOperator<String> taskThree = (text) -> text.substring(0, 5).toUpperCase().concat("_____");
        System.out.println("task3: " + taskThree.apply("hello world"));

        /*
Отсортировать с помощью стримов список из строк - по алфавиту; - в обратном порядке
 */
        List<String> mylist2 = new ArrayList<>();
        mylist2.add("Apple");
        mylist2.add("Cat");
        mylist2.add("Beefsteak");
        System.out.println("task 4:");
        mylist2.stream().sorted().forEach(System.out::println);

        List<String> mylist3 = new ArrayList<>();
        mylist3.add("Apple");
        mylist3.add("Cat");
        mylist3.add("Beefsteak");
        System.out.println("task 5:");
        mylist3.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        /*
        Из списка чисел типа Integer с помощью стримов создать список их строковых представлений
         */
        List<Integer> mylist4 = new ArrayList<>();
        mylist4.add(1);
        mylist4.add(2);
        mylist4.add(3);
        Function<List<Integer>, String> taskTwo2 = Object::toString;
        List<Integer> mylist5 = new ArrayList<>(mylist4);
        System.out.println("task6:");
        System.out.println(taskTwo2.apply(mylist5));
        System.out.println(mylist5.get(0).getClass());
    }
}
