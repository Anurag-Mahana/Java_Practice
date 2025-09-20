package B1_dataStructures;
import java.util.*;
import java.util.ArrayList;

public class b11_ArrayList {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			ArrayList<Integer> list1=new ArrayList<>();
			System.out.println("The initial size is:" +list1.size());
			list1.add(1);
			list1.add(2);
			list1.add(3);
			System.out.println(list1);
		}
	}
}
