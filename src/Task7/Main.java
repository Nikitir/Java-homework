package Task7;

public class Main {
    public static void main(String[] args) {

        Person leila = new Person(174, 61.1f, 21);
        leila.say("Hi, i'm Leila! My height is " + leila.height + "cm");

        Person viktor = new Person();
        viktor.height = 188;
        viktor.weight = 93.6f;
        viktor.age = 38;
        viktor.say("Hi, i'm Viktor! My weight is:");
        System.out.println(viktor.weight);

        Person laura = new Person(188, 59, 28);
        laura.say("Hi, i'm Laura! My height is " + laura.height + "cm and my age is " + laura.age);

        Student krist = new Student(178, 94f, 17, 2);
        krist.say("Hi, i'm Krist! I am on " + krist.course + " couse");

        System.out.println("For some questions call: " + Student.schoolPhone);
    }
}