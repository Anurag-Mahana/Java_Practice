package Session_2k26.a1_Flowcharts;

import java.util.*;
import static java.lang.System.exit;

public class a7_GCD_of_two_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers for which you want to find the GCD?");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                System.out.println("GCD is : " + result);
                exit(0);
            }
            result -= 1;
        }
    }
}
