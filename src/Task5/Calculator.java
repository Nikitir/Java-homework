package Task5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        Scanner myscan2 = new Scanner(System.in);
        int x, z, k;
        String y;
        x = myscan.nextInt();
        y = myscan2.nextLine();
        z = myscan.nextInt();
        switch (y) {
            case "+":
                k = x + z;
                System.out.print("=" + k);
                break;
            case "-":
                k = x - z;
                System.out.print("=" + k);
                break;
            case "*":
                k = x * z;
                System.out.print("=" + k);
                break;
            case "/":
                k = x / z;
                System.out.print("=" + k);
                break;
            default:
                System.out.println("Wrong sign");
        }
    }
}
