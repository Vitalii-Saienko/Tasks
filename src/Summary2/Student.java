package Summary2;

import java.util.ArrayList;

public class Student extends Human implements Play{

        private int classNumber;
        ArrayList <Subjects> mySubjects;
        Teacher teacher;

        public Student(String name, int id, int classNumber) {
            super(name, id);
            this.classNumber = classNumber;
        }


        @Override
        public void introduceYourself() {
            System.out.println("I'm a student!");
        }


        @Override
        public void play() {
            System.out.println("I am student i can play");
        }
    }

