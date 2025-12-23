package Session_1.A1_basics;
import java.util.*;

public class a3_LinearSearch {

	public static int searchEle(int arr[],int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in)){
			int arr[]=new int[] {3, 5, 6, 9, 12, 16, 19};
			System.out.println("Enter the element you want to search:");
			int ele=sc.nextInt();
			int pos= searchEle(arr,ele);
			if(pos<0)
				System.out.println(ele+" not found in given array");
			else
				System.out.println(ele+" found at index: " +pos);

		}catch(Exception e) {
			System.out.println("Please enter a valid integer value.");
		}
	}

}
