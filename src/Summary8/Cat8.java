package Summary8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Cat8 {
    String name;
    int age;
    String color;
    boolean isHungry;

    public Cat8(String name, int age, String color, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isHungry = isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    @Override
    public String toString() {
        return "Cat8{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isHungry=" + isHungry +
                '}';
    }

    public static void main(String[] args) {
        Cat8 cat1 = new Cat8("Tom", 2, "black", true);
        Cat8 cat2 = new Cat8("Mikky", 1, "white", false);
        Cat8 cat3 = new Cat8("Vasya", 3, "white", true);
        Cat8 cat4 = new Cat8("Steve", 1, "grey", false);
        Cat8 cat5 = new Cat8("Bob", 2, "black", true);
        List<Cat8> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5);
        feed(catList);
        System.out.println(catList);


        // task 2
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = getSum(integers);
        System.out.println(sum);

        // task 3
        Map<Boolean, List<Integer>> map = getMap();
        map = getMap();
        System.out.println(map);
    }
    private static void feed(List<Cat8> catList) {
        catList.stream()
                .filter(el-> el.isHungry)
                .forEach(cat -> cat.setHungry(false));
    }

    private static int getSum(List<Integer> integers) {
        return integers.stream()
                .filter(el->el % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static Map<Boolean, List<Integer>> getMap() {
        return IntStream.range(0, 20)
                .boxed()
                .collect(Collectors.partitioningBy(i -> i % 3 == 0));
    }
}
