package Task5;

import java.util.Scanner;

public class CalculatorWhile {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        Scanner myscan2 = new Scanner(System.in);
        String stop;
        do {
            int x, z, k;
            String y;
            System.out.print("Enter first number: ");
            x = myscan.nextInt();
            System.out.print("Enter sign (+,-,*,/): ");
            y = myscan2.nextLine();
            System.out.print("Enter second number: ");
            z = myscan.nextInt();
            switch (y) {
                case "+":
                    k = x + z;
                    System.out.println("=" + k);
                    break;
                case "-":
                    k = x - z;
                    System.out.println("=" + k);
                    break;
                case "*":
                    k = x * z;
                    System.out.println("=" + k);
                    break;
                case "/":
                    k = x / z;
                    System.out.println("=" + k);
                    break;
                default:
                    System.out.println("Wrong sign");
            }
            System.out.print("Do you want a stop? (yes/no): ");
            stop = myscan2.nextLine();
        } while (!stop.equals("yes"));
    }
}