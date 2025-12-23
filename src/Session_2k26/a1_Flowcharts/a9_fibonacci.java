package Session_2k26.a1_Flowcharts;
import java.util.*;

public class a9_fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for which you want to print the fibonacci series?");
        int n=sc.nextInt();
        int a=0,b=1,next;

        System.out.print(a+" "+b+" ");
        while (b<=n){
            next=a+b;
            a=b;
            b=next;
            System.out.print(next+" ");
        }
    }
}
