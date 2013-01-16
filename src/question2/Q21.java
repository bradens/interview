package question2;
import java.util.HashMap;

import linkedlist.*;

public class Q21 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.addToTail(1);
		l.addToTail(5);
		l.addToTail(3);
		l.addToTail(1);
		l.addToTail(4);
		l.addToTail(7);
		removeDupsBuffer(l);
		l.print();
	}
	public static void removeDupsBuffer(LinkedList list) {
		Node current = list.head;
		HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
		hm.put(current.data, true);
		while(current.next != null){
			if (hm.containsKey(current.next.data)) {
				current.next = current.next.next;
			}
			else {
				hm.put(current.next.data, true);
			}
			current = current.next;
		}
	}
}
