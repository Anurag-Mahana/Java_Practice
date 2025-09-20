package Z1_practice;
import java.util.*;

public class Node<T>{
	
	T data;
	Node next;
	
	Node(T data){
		this.data=data;
		next=null;
	}
	
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> n1=new Node<>(10);
		Node<Integer> n2=new Node<>(20);
		Node<Integer> n3=new Node<>(30);
		Node<Integer> n4=new Node<>(40);
		n1.next=n2;n2.next=n3;n3.next=n4;
		Node<Integer> head=n1;
		print(head);
		
		
	}
}
