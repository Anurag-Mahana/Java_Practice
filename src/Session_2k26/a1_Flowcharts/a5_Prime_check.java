package Session_2k26.a1_Flowcharts;

import java.util.Scanner;

import static java.lang.System.exit;

public class a5_Prime_check {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for which you want to check prime?");
        int dividend = sc.nextInt();
        int divisor = 2;
        if (dividend < 2) {
            System.out.println(dividend + " is not a prime number");
            exit(0);
        }
        while (divisor < dividend) {
            if (dividend % divisor == 0) {
                System.out.println(dividend + " is not a prime number");
                exit(0);
            }
            divisor += 1;
        }
        System.out.println(dividend + " is a prime number");
    }
}
