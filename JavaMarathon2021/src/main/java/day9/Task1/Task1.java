
package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Vova", "math");
        Teacher teacher = new Teacher("Galina Petrovna", "sociology");
        student.printInfo();
        teacher.printInfo();
    }
}