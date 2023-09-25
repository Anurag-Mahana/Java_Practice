package A1_basics;
import java.util.*;

public class a7_BubbleSort {

	public static void displayArr(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	public static void bubbleSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		displayArr(arr);

	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the size of the array:");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the elements of the array:");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("\nThe entered unsorted array is:");
			displayArr(arr);
			System.out.println("\nThe sorted array obtained is:");
			bubbleSort(arr);
		}

	}

}
