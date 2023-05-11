package Practise12;

public class Person12 {
    private String name;
    private int age;

    public Person12(String name, int age) {
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
        return "Person12{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
