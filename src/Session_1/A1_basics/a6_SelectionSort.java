package Session_1.A1_basics;
import java.util.*;

public class a6_SelectionSort {
	public static void displayArr(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	public static void selecSort(int arr[]) {

		for(int i=0;i<arr.length;i++) {
			int minEle=arr[i];
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<minEle) {
					minEle=arr[j];
					minIndex=j;
				}
			}
			if(minIndex!=i) {
				arr[minIndex]=arr[i];
				arr[i]=minEle;
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
			selecSort(arr);
		}

	}

}
