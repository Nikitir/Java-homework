package Task5;

import java.util.Scanner;

public class CalculatorWhilev2 {
    public static void main(String[] args) {
        int x, z, k;
        String y, stop;
        Scanner myscan = new Scanner(System.in);
        Scanner myscan2 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        x = myscan.nextInt();
        do {
            System.out.print("Enter sign (+,-,*,/): ");
            y = myscan2.nextLine();
            System.out.print("Enter second number: ");
            z = myscan.nextInt();
            switch (y) {
                case "+":
                    k = x + z;
                    System.out.println("=" + k);
                    x = k;
                    break;
                case "-":
                    k = x - z;
                    System.out.println("=" + k);
                    x = k;
                    break;
                case "*":
                    k = x * z;
                    System.out.println("=" + k);
                    x = k;
                    break;
                case "/":
                    k = x / z;
                    System.out.println("=" + k);
                    x = k;
                    break;
                default:
                    System.out.println("Wrong sign");
            }
            System.out.print("Do you want a stop? (yes/no): ");
            stop = myscan2.nextLine();
        } while (!stop.equals("yes"));
    }
}