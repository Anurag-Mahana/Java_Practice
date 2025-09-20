package A1_basics;
import java.util.*;

public class a2_Calculator {

	public static void sum(int x, int y) {
		System.out.println("The sum is: "+(x+y));
	}
	public static void sub(int x, int y) {
		System.out.println("The difference is: "+(x-y));
	}
	public static void mul(int x, int y) {
		System.out.println("The product is: "+(float)(x*y));
	}
	public static void div(int x, int y) {
		System.out.println("The quotient is: "+(float)(x/y));
	}

	public static void main(String[] args)throws Exception
	{

		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter the value for num 1:");
			int a=sc.nextInt();
			System.out.println("Enter the value for num 2:");
			int b=sc.nextInt();
			System.out.println("Enter the Calculation you want to perform: (+,-,/,*)");
			String operation=sc.next();
			switch(operation) {
			case "+":
				sum(a,b);
				break;
			case "-":
				sub(a,b);
				break;
			case "*":
				mul(a,b);
				break;
			case "/":
				div(a,b);
				break;
			default:
				System.out.println("Invalid expression for operation.\nPlease choose any one from given options :(+,-,/,*) ");
			}
		}catch(Exception e) {
			System.out.println("Invalid datatype entered as details.");
		}
	}

}
