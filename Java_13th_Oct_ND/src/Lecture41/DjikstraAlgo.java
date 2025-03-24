package Lecture41;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

import Lecture41.Prims.primspair;

public class DjikstraAlgo {

	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public DjikstraAlgo(int v) {
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

	public class Dpair {
		int v;
		String path;
		int cost;

		public Dpair(int v, String path, int cost) {
			this.v = v;
			this.path = path;
			this.cost = cost;
		}
		@Override
		public String toString() {
			return v + ": " + this.path + " @ " + cost;
		}
	}
	
	public void djikstra(int src) {
		PriorityQueue<Dpair>  pq =  new PriorityQueue<>(new Comparator<Dpair>() {

			@Override
			public int compare(Dpair o1, Dpair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> vis = new HashSet<>();
		pq.offer(new Dpair(src, ""+src, 0));// add src
		while(!pq.isEmpty()) {
			Dpair rv = pq.poll();// remove src
			
			if(vis.contains(rv.v)) {// check visited
				continue;
			}
			
			vis.add(rv.v);// mark visited
			System.out.println(rv);
			
			for (int nbr : graph.get(rv.v).keySet()) { // add nbrs
				int c = graph.get(rv.v).get(nbr) + rv.cost;
				if(!vis.contains(nbr)) {//nbr not visited
					pq.offer(new Dpair(nbr,rv.path+"=>"+nbr, c));
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DjikstraAlgo g = new DjikstraAlgo(7);
		g.addEdge(1, 2, 30);
		g.addEdge(1, 3, 40);
		g.addEdge(2, 4, 70);
		g.addEdge(2, 5, 90);
		g.addEdge(3, 4, 60);
		g.addEdge(5,6 , 10);
		g.addEdge(5, 7, 110);
		g.addEdge(6, 7, 130);
		
		g.djikstra(2);
	
	}

}
