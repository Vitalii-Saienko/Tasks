package Additional.Collections;

import java.util.Comparator;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class PersonComparator implements Comparator <Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}