package Lecture42;

import java.util.*;

public class TopologicalSort {
	
	private HashMap<Integer, HashSet<Integer>> graph;

	public TopologicalSort(int v) {
		graph = new HashMap<>();

		for (int i = 0; i <= v; i++) { // add 1-v vertice
			graph.put(i, new HashSet<>());
		}
	}

	public void addVertice(int v) {
		graph.put(v, new HashSet<>());
	}

	public void addEdge(int v1, int v2) {
		graph.get(v1).add(v2);
	}

	public void Display() {
		for (int i : graph.keySet()) {
			System.out.println(i + " ==> " + graph.get(i));
		}
	}
	
	public int[] getindegree() {
		int arr[] = new int[graph.size()];
		
		for (int v1 : graph.keySet()) {
			for (int v2 : graph.get(v1)) {
				arr[v2]++;
			}
		}
		
		return arr;
	}
	
	public void topoSort() {
		int arr[] = getindegree();
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				q.offer(i);
			}
		}
		while(!q.isEmpty()) {
			int rv = q.poll();
			System.out.print(rv+ " ");
			
			for (int nbrs: graph.get(rv)) {
				arr[nbrs] --;
				if(arr[nbrs]== 0) {
					q.offer(nbrs);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopologicalSort g = new TopologicalSort(5);
		g.addEdge(1, 0);
		g.addEdge(1, 5);
		g.addEdge(5, 3);
		g.addEdge(2, 3);
		g.addEdge(4, 0);
		g.addEdge(4, 2);
		
		g.topoSort();
		
	}

}
