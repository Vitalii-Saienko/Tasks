package Summary6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Cat {
    private String name;
    private int age;
    private String color;
    private boolean isHungry;

    public Cat(String name, int age, String color, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isHungry = isHungry;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public boolean isHungry() {
        return isHungry;
    }

    @Override
    public String toString() {
        return name + " " + age + " "  + color + " " + isHungry;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Bard", 3,"grey",true);
        Cat cat2 = new Cat("Bob", 1,"black",false);
        Cat cat3 = new Cat("Crazy", 2,"grey",true);
        Cat cat4 = new Cat("Wilhelm", 4,"white",false);
        Cat cat5 = new Cat("Tom", 3,"black",true);
        List <Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);
        catList.add(cat5);
        //- вывести список голодных кошек старше 2 лет filter():
        List <Cat> filterHungryAndOlderThen2 =
                catList.stream()
                .filter(elem->elem.isHungry && elem.getAge()>2)
                .toList();
        System.out.println("initial list: " + catList);
        System.out.println("hungry cats with age > 2: " + filterHungryAndOlderThen2);

        //- вывести список черных кошек с именем, начинающимся на T
        List <Cat> filterBlackColorNameStartsWithT =
                catList.stream()
                        .filter(elem->elem.getColor().equals("black") && elem.getName().charAt(0)=='T')
                        .toList();
        System.out.println("initial list: " + catList);
        System.out.println("black cats with name stars with T: " + filterBlackColorNameStartsWithT);

        //- вывести список имен кошек возраста 1 год filter() -> map ()
        Function <Cat, String> catStringFunction = (Cat::getName);
        List <String> catsAgeGreaterThen1 =
                catList.stream()
                        .filter(elem->elem.getAge()==1)
                        .map(catStringFunction)
                        .toList();
        System.out.println("initial list: " + catList);
        System.out.println("list contains cat names with age equals 1 year: " + catsAgeGreaterThen1);
    }
}
