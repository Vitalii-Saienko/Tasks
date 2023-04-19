package Additional.Collections;

import java.util.ArrayList;
import java.util.List;

public class BasicsArrayList {
    public static void main(String[] args) {
        Person person = new Person("Bob", 28);
        Person person2 = new Person("Lukas", 18);
        Person person3 = new Person("Steve", 25);

        List<Person> arrList = new ArrayList<>();
        arrList.add(person);
        arrList.add(person2);
        arrList.add(person3);
        arrList.add(new Person("James", 19));

        for (Person element: arrList) {
            System.out.println(element);
        }
        System.out.println("-----");

        System.out.println(arrList.get(2));
        System.out.println("-----");

        System.out.println(arrList.size());
        System.out.println("-----");

        PersonComparator personComparator = new PersonComparator();
        arrList.sort(personComparator);
        System.out.println(arrList);
        System.out.println("-----");

        arrList.add(new Person("Jim", 19));
        arrList.add(new Person("Jim", 19));
        System.out.println(arrList);
        System.out.println("-----");

        arrList.sort(personComparator);
        System.out.println(arrList);

        System.out.println("-----");
        for (Person element: arrList) {
            if (element.name.equals("Jim")) {
                System.out.println("ArrayList has Person with name Jim");
            }
        }

    }

}
