package Session_2k26.a1_Flowcharts;

import java.util.Scanner;

import static java.lang.System.exit;

public class a8_prime_nos_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (checkPrime(i) == true) {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean checkPrime(int dividend) {
        int divisor = 2;
        while (divisor < dividend) {
            if (dividend % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }
}
