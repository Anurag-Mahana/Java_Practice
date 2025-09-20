package Session_1.A1_basics;
import java.util.*;

public class a5_BinarySearch {
	public static int binaryS(int arr[],int key) {
		int start=0,end=arr.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(key==arr[mid])
				return mid;
			else if(key>arr[mid])
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			int arr[]=new int[] {3, 5, 6, 9, 12, 16, 19};
			System.out.println("Enter the element you want to search for:");
			int ele=sc.nextInt();
			int pos=binaryS(arr,ele);
			if(pos==-1)
				System.out.println(ele+" is not present in the given list");
			else
				System.out.println(ele+" present at positon: "+pos);
		}
		catch(Exception e) {
			System.out.println("Please enter a key value in Integer form.");
		}
	}

}
