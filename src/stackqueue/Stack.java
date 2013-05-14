package stackqueue;

public class Stack {
	public Node top;
	public Stack()  {
		this.top = null;
	}
	public void push(int d) { 
		Node newNode = new Node(d);
		newNode.next = this.top;
		this.top = newNode;
	}
	public int pop() {
		int d = this.top.data;
		this.top = this.top.next;
		return d;
	}
	public void print() {
		Node current = this.top;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}
