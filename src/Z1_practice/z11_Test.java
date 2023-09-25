package Z1_practice;

import java.util.Scanner;

public class z11_Test {
	public static void displayArr(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	public static void bubbleSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
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
