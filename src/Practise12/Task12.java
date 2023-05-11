package Practise12;

import java.util.*;
import java.util.stream.Collectors;

public class Task12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = sumOfSquaresNotEvenNumbers(numbers);
        System.out.println(result);
        System.out.println("------------------------------");
        List<String> words = Arrays.asList("apple", "banana", "Apricot", "orange", "aardvark");
        String prefix = "ap";
        long count = countWordsWithPrefix(words, prefix);
        System.out.println(count);
        System.out.println("------------------------------");
        List <Integer> numbers2 = Arrays.asList(1, 2, 3, 2, 4, 5, 4, 6, 7, 8, 7, 9);
        System.out.println(filterUniqueElements(numbers2));
        System.out.println("------------------------------");
        List <String> list = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println(findAverageLength(list));
        System.out.println("------------------------------");
        List<Person12> people = Arrays.asList(
                new Person12("Alice", 25),
                new Person12("Bob", 30),
                new Person12("Charlie", 20),
                new Person12("David", 35)
        );
        List<String> peopleWithAgeAbove = getPeopleWithAgeAbove(people, 29);
        System.out.println(peopleWithAgeAbove);
        System.out.println("------------------------------");
        List <Transaction> transactions = Arrays.asList(
                new Transaction(1,1000,"PENDING"),
                new Transaction(1,700,"PENDING"),
                new Transaction(1,1000,"APPROVED"),
                new Transaction(1,600,"APPROVED"),
                new Transaction(2,1000,"PENDING"),
                new Transaction(2,700,"PENDING"),
                new Transaction(2,1100,"APPROVED"),
                new Transaction(2,600,"APPROVED"),
                new Transaction(3,1000,"PENDING"),
                new Transaction(3,700,"PENDING"),
                new Transaction(3,500,"APPROVED"),
                new Transaction(3,600,"APPROVED")
        );
        System.out.println(sumApprovedTransactions(transactions));
        System.out.println("------------------------------");
        List<Student12> students = new ArrayList<>();
        students.add(new Student12("Alice", 20, 4.8));
        students.add(new Student12("Bob", 19, 3.9));
        students.add(new Student12("Charlie", 21, 4.5));
        students.add(new Student12("Diana", 18, 4.7));
        students.add(new Student12("Eva", 20, 4.2));
        System.out.println(averageAgeOfStudentsWithHighGrades(students));
        System.out.println("------------------------------");
        List <Order12> orders = new ArrayList<>();
        orders.add((new Order12(1,"1",50)));
        orders.add((new Order12(2,"1",100)));
        orders.add((new Order12(1,"2",200)));
        orders.add((new Order12(2,"2",200)));
        orders.add((new Order12(1,"3",50)));
        orders.add((new Order12(2,"3",160)));
        Map<String, Double> ordersMap = generateOrdersWithAmountGreaterThenValue(orders, 200);
        System.out.println(ordersMap);
    }
    /*
    найти среднюю сумму заказов для каждого клиента, у которого общая сумма заказов превышает заданную границу
    (threshold). Верните результат в виде Map<String, Double>, где ключом является идентификатор клиента
    (customerId), а значением - средняя сумма заказов для этого клиента.
     */
    private static Map<String, Double> generateOrdersWithAmountGreaterThenValue(List<Order12> orders, int threshold) {
        return orders.stream()
                .collect(Collectors.groupingBy(Order12::getCustomerId,
                        Collectors.summingDouble(Order12::getTotalAmount)))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > threshold)
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue() / orders.stream()
                        .filter(order -> order.getCustomerId().equals(entry.getKey()))
                        .count()));
    }

    /*
        У вас есть список студентов, представленных объектами класса Student со следующими полями: имя (String),
        возраст (int) и средняя оценка (double). Ваша задача - найти средний возраст студентов, чьи оценки выше 4.5.
         */
    private static double averageAgeOfStudentsWithHighGrades(List<Student12> students) {
        return students.stream()
                .filter(el->el.getAverageGrade() > 4.5)
                .mapToDouble(Student12::getAge)
                .average()
                .orElse(0);
    }


    private static long countWordsWithPrefix(List<String> words, String prefix) {
        return words.stream()
                .filter(el->el.toLowerCase().startsWith(prefix.toLowerCase()))
                .count();
    }

    /*
    Дан список целых чисел. Напишите метод, который возвращает сумму квадратов всех нечетных чисел из списка.
     */
    public static int sumOfSquaresNotEvenNumbers (List<Integer> numbers){
        return numbers.stream()
                .filter(el->el % 2 != 0)
                .mapToInt(el->el*el)
                .sum();
    }
    /*
    Напишите метод filterUniqueElements, который принимает список целых чисел и возвращает новый список,
    содержащий только уникальные элементы из исходного списка.
     */
    public static List<Integer> filterUniqueElements (List <Integer> integerList){
        return integerList.stream()
                .distinct()
                .toList();
    }
    /*
    Напишите метод, который принимает список строк и возвращает среднюю длину слов в этом списке.
    Средняя длина должна быть округлена до ближайшего целого числа.
     */
    public static int findAverageLength (List<String> list){
        double answer = list.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);
        return (int) answer;
    }
    /*
    Вам необходимо написать метод, который принимает список объектов класса Person и возвращает список имен людей,
    чей возраст превышает определенное значение.
     */
    private static List<String> getPeopleWithAgeAbove(List<Person12> people, int age) {
        return people.stream()
                .filter(el->el.getAge() > age)
                .map(Person12::getName)
                .toList();
    }
    /*
    написать метод, который будет находить общую сумму утвержденных транзакций для каждого уникального идентификатора
    транзакции и возвращать результат в виде Map<String, Integer>, где ключом будет идентификатор транзакции,
    а значением - общая сумма утвержденных транзакций для этого идентификатора.
     */
    public static Map<Integer, Integer> sumApprovedTransactions (List<Transaction> transactions){
        return transactions.stream()
                .filter(el->el.getStatus().equals("APPROVED"))
                .collect(Collectors.toMap(
                        el -> el.getId(),
                        elem -> elem.getAmount(),
                        (count1, count2) -> count1+count2,
                        HashMap::new));
    }


}
