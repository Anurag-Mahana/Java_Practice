package Session_2k26.a1_Flowcharts;

import java.util.Scanner;

public class a2_Largest_of_three_method2 {
    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values for a,b,c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int largest = a; //assume
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        System.out.println("The largest valye is: " + largest);
    }
}
