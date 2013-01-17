package question3;

import java.util.LinkedList;
import java.util.List;

import stackqueue.Stack;

public class Q25 {
	private static List<Stack> stacks = new LinkedList<Stack>();
	private static Stack originalStack = new Stack();
	public static void main(String[] args) {
		originalStack.push(2);
		originalStack.push(3);
		originalStack.push(9);
		originalStack.push(1);
		originalStack.print();
		sort(originalStack);
		originalStack.print();
	}
	public static void sort(Stack sortingStack) {
		if (sortingStack.top == null) return;
		Stack newStack = new Stack();
		newStack.push(sortingStack.pop());
		stacks.add(newStack);
		while (sortingStack.top != null) {
			int d = sortingStack.pop();
			boolean minStack = false;
			for(Stack s : stacks) {
				if (d < s.top.data) {
					s.push(d);
					minStack = true;
					break;
				}
			}
			if (!minStack) { 
				Stack maxStack = new Stack();
				maxStack.push(d);
				stacks.add(maxStack);
			}
		}
		for (Stack s : stacks) {
			while (s.top != null) {
				originalStack.push(s.pop());
			}
		}
	}
}
