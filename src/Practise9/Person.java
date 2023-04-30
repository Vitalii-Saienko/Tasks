package Practise9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/*
List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
     *   List<String> names = people.stream()
     * - Преобразование списка объектов класса в список их имен, отсортированных по возрасту
    class Person {
    private String name;
    private int age;
}
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //Преобразование списка объектов класса в список их имен, отсортированных по возрасту
    //1.sort by age, 2.extract sorted by age names
    public static List<String> convertingObjectsListToNamesList(List <Person> inputList){
        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);
        Function <Person, String> function = (Person::getName);
        return inputList.stream()
                .sorted(ageComparator)
                .map(function)
                .toList();
    }


    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
        System.out.println(convertingObjectsListToNamesList(people));
    }


}
