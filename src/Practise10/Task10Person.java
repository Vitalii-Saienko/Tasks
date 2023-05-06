package Practise10;

import java.util.Comparator;

public class Task10Person implements Comparator <Task10Person> {
    private String name;
    private int age;

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

    public Task10Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compare(Task10Person o1, Task10Person o2) {
        return o2.getAge()- o1.getAge();
    }
}
