package Session_1.A1_basics;
import java.util.*;

public class a4_StringReverseRecursion {
	public static String strRev(String s) {
		if(s.length()==0||s.length()==1)
			return s;
		return strRev(s.substring(1))+s.charAt(0);
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the String you want to perform");
			String str=sc.nextLine();
			System.out.println("Original string entered: "+str);
			System.out.println("String obtained after performing reverse operation: "+strRev(str));
		}
	}
}
