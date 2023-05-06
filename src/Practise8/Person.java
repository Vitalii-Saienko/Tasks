package Practise8;

import java.util.ArrayList;
import java.util.List;

public class Task8Person {
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
        return "Task10Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Task8Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Task8Person person = new Task8Person("Jim", 24);
        Task8Person person2 = new Task8Person("Jim", 24);
        Task8Person person3 = new Task8Person("Jim", 36);
        Task8Person person4 = new Task8Person("Jim", 36);

        List <Task8Person> list = new ArrayList<>();
        list.add(person);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        System.out.println("our list original: " + list);

        List <Task8Person> list2 = new ArrayList<>(list);
        System.out.println("list2 before stream: " + list2);

        List <Task8Person> list3 = list2.stream()
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
