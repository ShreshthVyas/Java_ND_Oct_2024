package Lecture42;

import java.util.*;

public class BellmanFord {
	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public BellmanFord(int v) {
		graph = new HashMap<>();

		for (int i = 1; i <= v; i++) { // add 1-v vertice
			graph.put(i, new HashMap<>());
		}
	}

	public void addVertice(int v) {
		graph.put(v, new HashMap<>());
	}

	public void addEdge(int v1, int v2, int w) {
		graph.get(v1).put(v2, w);
	}

	public void Display() {
		for (int i : graph.keySet()) {
			System.out.println(i + " ==> " + graph.get(i));
		}
	}

	public class edgepair {
		int v1;
		int v2;
		int c;

		public edgepair(int v1, int v2, int cost) {
			this.v1 = v1;
			this.v2 = v2;
			this.c = cost;
		}

		@Override
		public String toString() {
			return v1 + ": " + v2 + " @ " + c;
		}
	}

	public List<edgepair> getEdges() {
		List<edgepair> list = new ArrayList<>();
		for (int v1 : graph.keySet()) {
			for (int v2 : graph.get(v1).keySet()) {
				int c = graph.get(v1).get(v2);
				list.add(new edgepair(v1, v2, c));
			}
		}
		return list;
	}

	public void bellmanford() {
		int v = graph.size();
		int arr[] = new int[v + 1];

		for (int i = 2; i < arr.length; i++) {
			arr[i] = 9999999; // Note:Avoid Integer.MAX to prevent overflow
		}

		List<edgepair> list = getEdges();

		for (int i = 1; i <=v; i++) { // to relax edges v-1 times

			for (edgepair ep : list) {// to relax each edgespair
				
				if (i == v && arr[ep.v2] > arr[ep.v1] + ep.c) { // -ve cycle
					System.out.println("-ve Cycle");
					return;
				}
				
				if (arr[ep.v2] > arr[ep.v1] + ep.c) {
					arr[ep.v2] = arr[ep.v1] + ep.c;
				}
			}

		}

		for (int i = 1; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BellmanFord g = new BellmanFord(3);
//		g.addEdge(1, 2, 10);
//		g.addEdge(1, 3, 20);
//		g.addEdge(1, 4, -10);
//		g.addEdge(2, 3, 20);
//		g.addEdge(4, 5, 30);
//		g.addEdge(4, 3, 10);
//		g.addEdge(5, 6, 50);
//		g.addEdge(4, 2, 5);
		
		g.addEdge(1, 2, -1);
		g.addEdge(2, 3, -5);
		g.addEdge(3, 1, -10);
		
		g.bellmanford();
		
	}

}
