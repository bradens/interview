package linkedlist;

public class LinkedList {
	public Node head; 
	public LinkedList() {
		head = null;
	}
	public void print() {
		System.out.print("[");
		for (Node current = this.head;;current = current.next) {
			System.out.print(current.data);
			if (current.next == null){
				break;
			}
			System.out.print(", ");
		}
		System.out.println("]");
	}
	public void addToTail(int d){
		Node end = new Node(d);
		Node current = this.head;
		if (this.head == null) {
			this.head = end;
			return;
		}
		while (current.next != null) {
			current = current.next;
		}
		current.next = end;
	}
	public void deleteNode(int d) {
		Node current = this.head;
		if (current.data == d){
			this.head = current.next;
		}
		while (current.next != null){
			if (current.next.data == d) {
				current.next = current.next.next;
			}
		}
	}
}
