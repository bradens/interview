package graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiGraph {
	public Map<Integer, List<Integer>> edges;
	public int n;
	
	public DiGraph(){
		 edges = new HashMap<Integer, List<Integer>>();
	}
	public void addEdge(int n1, int n2) {
		if (edges.containsKey(n1)) {
			// there must be a list 
			edges.get(n1).add(n2);
		}
		else {
		}
		n = edges.size();
	}
}
