package Linked_List;
import java.util.*;

public class LinkedListUse {

	public static Node<Integer> createLinkedList(){ //Manual way of creating nodes
		Node<Integer> n1=new Node<>(10);
		Node<Integer> n2=new Node<>(20);
		Node<Integer> n3=new Node<>(30);
		n1.next=n2;
		n2.next=n3;
		return n1;
	}

	public static Node<Integer> takeInput(){  //Creating nodes by taking input
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the elements of the linked list and final element as -1");
			int data=sc.nextInt();
			Node<Integer> head=null,tail=null;
			while(data!=-1)
			{
				Node<Integer> currNode=new Node<>(data);
				if(head==null) { //make currNode as head
					head=currNode;
					tail=currNode;
				}
				else {
					tail.next=currNode;
					tail=currNode;
					//tail refers to the last node
				}
				data=sc.nextInt();
			}
			return head;
		}
	}

	public static Node<Integer> insertNode(Node<Integer> head, int pos,int val) {
		Node<Integer> nodeIns=new Node<>(val);

		if(pos==0) {
			nodeIns.next=head;
			head=nodeIns;
			return nodeIns;
		}
		else 
		{
			int curr=0;
			Node<Integer> prev=head;
			while(curr<pos-1 && prev!=null) {
				curr++;
				prev=prev.next;
			}//reached the place where we need to insert.
			if(prev!=null) {
				nodeIns.next=prev.next;
				prev.next=nodeIns;
			}
			return head;
		}
	}
	
	public static Node<Integer> deleteNode(Node<Integer> head, int pos){
		if(head==null) {
			return head;
		}
		if(pos==0) {
			return head.next;
		}
		
		int curr=0;
		Node<Integer> currNode=head;
		while(currNode!=null && curr<(pos-1)) {
			currNode=currNode.next;
			curr++;
		}
		if(currNode == null|| currNode.next==null) {
			return head;
		}
		currNode.next=currNode.next.next;
		return head;
	}

	public static void print(Node<Integer> head) {   //Print the complete LL
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void printNode(Node<Integer> head, int i)     //Print the ith Element of the LL
	{
		int curr=0;
		Node<Integer> temp=head;
		while(temp!=null && curr<i)
		{
			temp=temp.next;
			curr++;                 //traverse
		}
		if( curr==i)
			System.out.println(temp.data);
	}

	public static void lengthList(Node<Integer> head) {   //Prints the length of the LL
		int count=0;
		while(head!=null) {
			count+=1;
			head=head.next;
		}
		System.out.println("\nThe length of the linked list is: "+count);
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			Node<Integer> head=takeInput();
			lengthList(head);
			print(head);
			System.out.println();
			printNode(head,2);
			insertNode(head,2,15);
			lengthList(head);
			print(head);
			deleteNode(head,3);
			lengthList(head);
			print(head);
			
		}
	}
}