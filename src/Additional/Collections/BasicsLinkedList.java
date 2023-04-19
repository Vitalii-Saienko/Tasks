package Additional.Collections;

import java.util.LinkedList;
import java.util.List;

public class BasicsLinkedList {
    public static void main(String[] args) {
        Person person = new Person("Bob", 28);
        Person person2 = new Person("Lukas", 18);
        Person person3 = new Person("Steve", 25);

        List<Person> linkList = new LinkedList<>();
        linkList.add(person);
        linkList.add(person2);
        linkList.add(person3);
        linkList.add(new Person("Bruce", 40));
        linkList.add(new Person("Bruce", 41));

        for (Person element: linkList){
            System.out.println(element);
        }
        PersonComparator personComparator = new PersonComparator();
        linkList.sort(personComparator);
        System.out.println(linkList);

        System.out.println(linkList.size());
        System.out.println(linkList.get(4));

        linkList.removeIf(element -> element.name.equals("Bruce") && element.age == 38);
        System.out.println(linkList);

        linkList.removeIf(element -> element.name.equals("Bruce"));
        System.out.println(linkList);

        linkList.removeIf(someName -> !someName.name.equals("Steve"));
        System.out.println(linkList);
    }
}
