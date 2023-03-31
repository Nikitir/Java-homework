package Task6Array;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayInt2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < 9; ) {
            System.out.println(arrayInt1[i]);
            i++;
        }
        for (int i = 0; i < arrayInt2.length; i++) {
            System.out.println(arrayInt2[i]);
        }
        System.out.println(arrayInt1[arrayInt1.length - 1]);
    }
}
