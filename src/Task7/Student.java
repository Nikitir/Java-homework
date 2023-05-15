package Task7;

public class Student extends Person {

    public static int schoolPhone = 123456789;
    int course;

    Student(int height, float weight, int age, int course) {
        super(height, weight, age);
        this.course = course;


    }
}
