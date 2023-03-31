package Task4;

import java.util.Scanner;

public class Main {
    /*
     * Enter a number through Scanner from 1 to 9 and do some mathematical action with using if, else.
     * If it is less than 5 (if), then there will be an addition,
     * and if it is more than 5, then a subtraction will be done (else) */

    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sum.nextInt();
        if (number <= 5) {
            int plus = number + 4;
            System.out.println(plus);
        } else {
            int minus = number - 6;
            System.out.println(minus);
        }
    }
}

