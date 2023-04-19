package Task4;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private String name;

    private String surname;

    private int age;


    @Override
    public int compareTo(Person o) {
        int result = this.surname.compareTo(o.surname);
        if (result != 0) return result;
        result = this.name.compareTo(o.name);
        if (result != 0) return result;
        return this.age - o.age;
    }

}
