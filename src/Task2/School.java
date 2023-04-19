package Task2;

public class School {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Smith", Subjects.BANKING_SYSTEMS);

        Student student = new Student("Bill", 2, 5);


        student.sayHello();
        student.introduceYourself();
        System.out.println("==============");
        teacher.teach(student);
        System.out.println("==============");


    }

    private static void restTime(Play ... plays){
        for (Play p: plays) {
            p.play();
        }
    }

}