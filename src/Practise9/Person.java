package Practise9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/*
List<Task10Person> people = Arrays.asList(new Task10Person("John", 25), new Task10Person("Alice", 22), new Task10Person("Bob", 30));
     *   List<String> names = people.stream()
     * - Преобразование списка объектов класса в список их имен, отсортированных по возрасту
    class Task10Person {
    private String name;
    private int age;
}
 */
public class Task9Person {
    private String name;
    private int age;

    public Task9Person(String name, int age) {
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
        return "Task10Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //Преобразование списка объектов класса в список их имен, отсортированных по возрасту
    //1.sort by age, 2.extract sorted by age names
    public static List<String> convertingObjectsListToNamesList(List <Task9Person> inputList){
        Comparator<Task9Person> ageComparator = Comparator.comparingInt(Task9Person::getAge);
        Function <Task9Person, String> function = (Task9Person::getName);
        return inputList.stream()
                .sorted(ageComparator)
                .map(function)
                .toList();
    }


    public static void main(String[] args) {
        List<Task9Person> people = Arrays.asList(new Task9Person("John", 25), new Task9Person("Alice", 22), new Task9Person("Bob", 30));
        System.out.println(convertingObjectsListToNamesList(people));
    }


}
