package question4;

import graph.DiGraph;

public class Q42 {
	public static void main(String[] args) { 
		DiGraph g = new DiGraph();
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(0, 2);
		System.out.println(canVisit(g, 0, 2));
	}
	public static boolean canVisit(DiGraph g, int nodeFrom, int nodeTo) {
		return false;
	}
}
