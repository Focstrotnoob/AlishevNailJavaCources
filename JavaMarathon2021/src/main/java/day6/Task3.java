package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Galina Ivanovna", "Math");
        Student student = new Student("kirill Vladimirovich");

        teacher.evaluate(student);

    }
}