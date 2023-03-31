package Task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.print("Hello world xD ");
        Bird bird = new Bird();
        int a = 5, b = 12;
        int a1 = bird.sumInt(a, b);
        String b2 = bird.sumString(2, 8);
        System.out.println(bird.sumInt(5, 6));
        System.out.println(bird.sumString(2, 8));
        System.out.println(a1 + " 33 " + b2);
        System.out.println(a1+a1);
        System.out.println(a1 + " " + a1);
        int c = bird.sumInt2(9, b);
        System.out.println(c);
    }

}