package question3;
import stackqueue.*;
public class Q24 {
	private Stack front;
	private Stack back;
	public Q24() {
		front = new Stack();
		back = new Stack();
	}
	public void enqueue(int d) {
		if (back.top == null && front.top == null) {
			front.push(d);
			back.top = front.top;
		}
		front.push(d);
	}
	public int dequeue() {
		return back.pop();
	}
	public static void main(String[] args) {
		Q24 myQueue = new Q24();
		myQueue.enqueue(1);
		myQueue.enqueue(2);
		myQueue.enqueue(3);
		
	}
}
