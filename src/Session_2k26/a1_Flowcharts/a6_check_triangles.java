package Session_2k26.a1_Flowcharts;

//Problem Name: Check triangle
//        Problem Level: MEDIUM
//        Problem Description: #### You are given the lengths of 3 sides of a valid triangle. You need to print any one of the following outputs depending on the triangle's nature.
//        #### Print 1, if the triangle is equilateral
//        #### Print 0, if it's isosceles
//        #### Print -1, if it's scalene
//        #### Draw a flowchart for this process.

import java.util.Scanner;

public class a6_check_triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < 1 || b < 1 || c < 1) System.out.println("Please enter a valid triangle");
        else if (a == b && b == c && a == c) System.out.println("equilateral");
        else if (a == b || b == c || a == c) System.out.println("isosceles");
        else System.out.println("scalene");
    }
}

