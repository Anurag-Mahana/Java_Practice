package Session_2k26.a1_Flowcharts;

import java.util.Scanner;

public class a4_largest_between_given_numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you have in your mind?");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the individual numbers?");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered values:");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        int largest = -10000;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) largest = arr[i];
        }
        System.out.println("\n The largest value is " + largest);
    }
}

