package Session_2k26.a1_Flowcharts;

import java.util.Scanner;

public class a2_Largest_of_three {
    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values for a,b,c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b && a > c) System.out.println(a + " is the largest");
        else if (b > c) System.out.println(b + " is the largest");
        else System.out.println(c + " is the largest");
    }
}
