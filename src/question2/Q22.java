package question2;

import linkedlist.LinkedList;
import linkedlist.Node;
public class Q22 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.addToTail(1);
		l.addToTail(5);
		l.addToTail(3);
		l.addToTail(1);
		l.addToTail(4);
		l.addToTail(7);
		l.print();
		System.out.println(findNthToLast(l, 5));
	}
	
	public static int findNthToLast(LinkedList l, int n) {
		Node p2 = l.head;
		for (int i = 0;i < n-1;i++) {
			p2 = p2.next;
		}
		l.print();
		return recFindNth(l.head, p2, n);
	}
	
	public static int recFindNth(Node p1, Node p2, int n) {
		if (p2.next == null) {
			return p1.data;
		}
		else {
			for (int i = 0;i < n;i++) {
				p2 = p2.next;
				p1 = p1.next;
				if (p2.next == null) {
					return p1.data;
				}
			}
			return recFindNth(p1, p2, n);
		}
	}
	
	public static int findN(LinkedList l, int n) {
		int ip1 = 1;
		int ip2 = 2;
		int ip3 = 3;
		Node p1 = l.head;
		Node p2 = p1.next;
		Node p3 = p2.next;
		while (true) {
			if (ip3 > n) {
				// go from ip2 -> ip3
				while (ip2 != n) {
					p2 = p2.next;
					ip2++;
				}
				return p2.data;
			}
			else if (ip2 > n) {
				// ip1 -> ip2
				while(ip1 != n) {
					p1 = p1.next;
					ip1++;
				}
				return p1.data;
			}
			else if (ip2 < n){
				p1 = p1.next;
				p2 = p2.next.next;
				p3 = p3.next.next.next;
				ip1++;
				ip2 = ip2 + 2;
				ip3 = ip3 + 3;
			}
		}
	}
}

