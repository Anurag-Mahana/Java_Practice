package Session_2k26.a1_Flowcharts;

import java.util.Scanner;

public class a3_print_numbers_1_to_n {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit upto which you want to print the numbers?");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.print(i + " ");
    }
}
