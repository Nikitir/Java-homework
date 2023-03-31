package Task5;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        Scanner myscan2 = new Scanner(System.in);
        int x, z, k;
        String y;
        x = myscan.nextInt();
        y = myscan2.nextLine();
        z = myscan.nextInt();
        if (y.equals("+")) {
            k = x + z;
            System.out.print("=" + k);
        } else if (y.equals("-")) {
            k = x - z;
            System.out.print("=" + k);
        } else if (y.equals("*")) {
            k = x * z;
            System.out.print("=" + k);
        } else if (y.equals("/")) {
            k = x / z;
            System.out.print("=" + k);
        } else {
            System.out.println("Error?");
        }
    }
}

