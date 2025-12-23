package Session_1.SingleLL;
import java.util.*;


public class SingleLL<T> {
//Node template.
	public static class Node<T>{
		T data;
		Node<T> next;

		Node(T data){
			this.data=data;
			this.next=null;
		}
	}

	private Node<T> head;

	public boolean removeByData(T data) {
		Node<T> curr=head;
		if(head==null) {
			return false;
		}
		if(head.data.equals(data)) {
			head=head.next;
			return true;
		}
		while(curr.next!=null) {
			if (curr.next.data.equals(data)) {
				curr.next = curr.next.next;
				return true;
			}
			curr = curr.next;
		}
		return false;
	}

	public void display() {
		Node<T> curr= head;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.println("null\n");
	}
	
	public void push(T data) {
		Node<T> newNode=new Node<T>(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node<T> curr= head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=newNode;
		}
	}

	public void unshift(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}



	public T pop() {
		if (head == null) {
			throw new NoSuchElementException("The list is empty.");
		}

		if (head.next == null) {
			T data = head.data;
			head = null; // Set the head to null since there's only one element in the list.
			return data;
		}

		Node<T> current = head;
		while (current.next.next != null) {
			current = current.next;
		}

		T data = current.next.data;
		current.next = null; // Remove the last element from the list.
		return data;
	}

	public T shift() {
		if (head == null) {
			throw new NoSuchElementException("The list is empty.");
		}

		T data = head.data;
		head = head.next;
		return data;
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			SingleLL<Integer> List=new SingleLL<>();
			List.push(10);
			List.push(20);
			List.push(30);

			int choice = 0;
			while (choice != 6) {
				System.out.println("---------------------------------------------------------------\n");
				System.out.println("1. View List");
				System.out.println("2. Push data in List");
				System.out.println("3. Unshift data to List");
				System.out.println("4. Pop from List");
				System.out.println("5. Shift List");

				System.out.print("Enter your choice: ");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("\nThe present Linked list is:");
					List.display();
					break;

				case 2:
					System.out.println("\nEnter the value to push:");
					int elePush= sc.nextInt();
					List.push(elePush);
					break;

				case 3:
					System.out.println("\nEnter the value to unshift:");
					int eleUnshift= sc.nextInt();
					List.unshift(eleUnshift);
					break;

				case 4:
					System.out.println("\nElement popped out successfully!:");
					List.pop();
					break;

				case 5:
					System.out.println("\nElement shifted out successfully!:");
					List.shift();
					break;

				case 6:
					break;	


				default:
					System.out.println("Invalid choice!");
				}
			}
		}
	}
}
