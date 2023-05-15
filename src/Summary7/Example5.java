package Summary7;
import java.util.*;
import java.util.stream.Collectors;
public class Example5 {
/*
Студент записывает книги которые прочитал, задача вывести все прочитанные книги у всех студентов (в качестве
дополнения, применить фильтр на любую тему)
 */
public static void main(String[] args) {
    Student student1 = new Student();
    student1.setName("Aleks");
    student1.addBook("Java 8 vs Java 19");
    student1.addBook("Spring Boot in Action");
    student1.addBook("Effective Java");

    Student student2 = new Student();
    student2.setName("Thomas");
    student2.addBook("HTML introducing");
    student2.addBook("Effective Java");

    List<Student> list = new ArrayList<>();
    list.add(student1);
    list.add(student2);

    List <String> bookList = list.stream()
            .flatMap(elem-> elem.getBook().stream())
            .filter(elem->!elem.equals("HTML introducing"))
            .distinct()
            .toList();
    System.out.println(bookList);


}
}

class Student {
    private int id;
    private String name;
    private Set<String> book;

    public void addBook(String book) {
        if (this.book == null)
            this.book = new HashSet<>();

        this.book.add(book);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getBook() {
        return book;
    }

    public void setBook(Set<String> book) {
        this.book = book;
    }
}

