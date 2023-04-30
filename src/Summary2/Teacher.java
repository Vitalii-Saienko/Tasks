package Summary2;

public class Teacher implements Play {
    String name;
    Subjects subjects;

    public Subjects getSubjects() {
        return subjects;
    }

    public Teacher(String name, Subjects subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    @Override
    public void play() {
        System.out.println("I am teacher, i also like to play");
    }

    public void teach(Student student) {
        System.out.println("I am teacher. My job is to teach students. My subjects is: " + subjects.name());
        student.mySubjects.add(getSubjects());
    }
}
