package Lecture41;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prims {

	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Prims(int v) {
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
		graph.get(v2).put(v1, w);
	}

	public void Display() {
		for (int i : graph.keySet()) {
			System.out.println(i + " ==> " + graph.get(i));
		}
	}

	public class primspair {
		int v;
		int aqv;
		int cost;

		public primspair(int v, int aqv, int cost) {
			this.v = v;
			this.aqv = aqv;
			this.cost = cost;
		}
		@Override
		public String toString() {
			return v + "-->" + aqv + " @ " + cost;
		}
	}
	
	public int MST() {
		PriorityQueue<primspair>  pq =  new PriorityQueue<>(new Comparator<primspair>() {

			@Override
			public int compare(primspair o1, primspair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> vis = new HashSet<>();
		pq.offer(new primspair(1, 1, 0));// add src
		int mst =0;
		while(!pq.isEmpty()) {
			primspair rv = pq.poll();// remove src
			
			if(vis.contains(rv.v)) {// check visited
				continue;
			}
			
			vis.add(rv.v);// mark visited
			mst+= rv.cost;
			System.out.println(rv);
			
			for (int nbr : graph.get(rv.v).keySet()) { // add nbrs
				int c = graph.get(rv.v).get(nbr);
				if(!vis.contains(nbr)) {//nbr not visited
					pq.offer(new primspair(nbr, rv.v, c));
				}
			}
		}
		return mst;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prims g = new Prims(7);
		g.addEdge(1, 2, 30);
		g.addEdge(1, 3, 40);
		g.addEdge(2, 4, 70);
		g.addEdge(2, 5, 90);
		g.addEdge(3, 4, 60);
		g.addEdge(5,6 , 10);
		g.addEdge(5, 7, 110);
		g.addEdge(6, 7, 130);
		
		System.out.println(g.MST());
	
	}

}
