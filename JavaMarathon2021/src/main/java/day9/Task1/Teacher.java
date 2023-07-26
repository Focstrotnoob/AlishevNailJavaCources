
package day9.Task1;

public class Teacher extends Human{

    private String subjectName;

    public Teacher(String name, String subject) {
        super(name);
        this.subjectName = subject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + this.getName());
    }
}