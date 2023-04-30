package Practise8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("Jim", 24);
        Person person2 = new Person("Jim", 24);
        Person person3 = new Person("Jim", 36);
        Person person4 = new Person("Jim", 36);

        List <Person> list = new ArrayList<>();
        list.add(person);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        System.out.println("our list original: " + list);

        List <Person> list2 = new ArrayList<>(list);
        System.out.println("list2 before stream: " + list2);

        List <Person> list3 = list2.stream()
                .map(el -> {
                    if (el.age > 35) {
                        el.setName(el.getName().toUpperCase());
                    }
                    return el;
                }).toList();
        System.out.println("list2 after stream: " + list2);
        System.out.println("list3 after stream: " + list3);
    }
}
