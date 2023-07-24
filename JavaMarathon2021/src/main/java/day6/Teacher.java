package day6;

import java.util.Random;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student){
        int x = (int) (Math.random()* 4) + 2;
        System.out.println(x);
        String rating = " ";
        switch (x){
            case 2: rating = "неудовлетворительно";
                break;
            case 3: rating = "удовлетворительно";
                break;
            case 4: rating = "хорошо";
                break;
            case 5: rating = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + rating);
    }
}