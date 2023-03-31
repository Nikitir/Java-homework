package Task3;

public class Main {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        String sentences1 = turtle.threeString("word1", "word3");
        System.out.println(sentences1);
        String sentence2 = turtle.threeString("word1", sentences1);
        System.out.println(sentence2);
    }
}
