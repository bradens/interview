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
		System.out.println(findN(l, 5));
	}
	
	public static int findN(LinkedList l, int n) {
		int ip1 = 1;
		int ip2 = 2;
		int ip3 = 3;
		Node p1 = l.head;
		Node p2 = p1.next;
		Node p3 = p2.next;
		int count = 0;
		while (true) {
			count++;
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

