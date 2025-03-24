package Lecture41;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph2 {
private HashMap<Integer, HashMap<Integer , Integer>> graph;
	
	public Graph2(int v) {
		graph = new HashMap<>();
		
		for (int i = 1; i <= v; i++) { // add 1-v vertice
			graph.put(i, new HashMap<>());
		}
	}
	
	public void addVertice(int v) {
		graph.put(v, new HashMap<>());
	}
	
	public void addEdge(int v1, int v2,int w) {
		graph.get(v1).put(v2, w);
		graph.get(v2).put(v1, w);
	}
	public void Display() {
		for (int i : graph.keySet()) {
			System.out.println(i + " ==> " + graph.get(i));
		}
	}
	
	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> vis = new HashSet<>();
		
		for (int  src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);// add src
			
			while(!q.isEmpty()) {
				int rv = q.poll();// remove src
				
				if(vis.contains(rv)) {// check visited
					continue;
				}
				
				vis.add(rv);// mark visited
				System.out.print(rv+" ");
				
				for (int nbr : graph.get(rv).keySet()) { // add nbrs
					if(!vis.contains(nbr)) {//nbr not visited
						q.offer(nbr);
					}
				}
			}
		}
	}
	public void DFT() {
		Stack<Integer> q = new Stack<>();
		HashSet<Integer> vis = new HashSet<>();
		
		for (int  src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);// add src
			
			while(!q.isEmpty()) {
				int rv = q.pop();// remove src
				
				if(vis.contains(rv)) {// check visited
					continue;
				}
				
				vis.add(rv);// mark visited
				System.out.print(rv+" ");
				
				for (int nbr : graph.get(rv).keySet()) { // add nbrs
					if(!vis.contains(nbr)) {//nbr not visited
						q.add(nbr);
					}
				}
			}
		}
	}
	
	public boolean isConnected() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> vis = new HashSet<>();
		int count = 0;
		for (int  src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);// add src
			count++;
			while(!q.isEmpty()) {
				int rv = q.poll();// remove src
				
				if(vis.contains(rv)) {// check visited
					continue;
				}
				
				vis.add(rv);// mark visited
				
				for (int nbr : graph.get(rv).keySet()) { // add nbrs
					if(!vis.contains(nbr)) {//nbr not visited
						q.offer(nbr);
					}
				}
			}
		}
		
		return count == 1;
	}
	
	public boolean isCyclic() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> vis = new HashSet<>();
		
		for (int  src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);// add src
			
			while(!q.isEmpty()) {
				int rv = q.poll();// remove src
				
				if(vis.contains(rv)) {// check visited
					return true; // cyclic
				}
				
				vis.add(rv);// mark visited
				
				
				for (int nbr : graph.get(rv).keySet()) { // add nbrs
					if(!vis.contains(nbr)) {//nbr not visited
						q.offer(nbr);
					}
				}
			}
		}
		return false;
	}
	
	public boolean isTree() {
//		return isConnected() && !isCyclic();
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> vis = new HashSet<>();
		int count =0;
		for (int  src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.add(src);// add src
			count++;
			while(!q.isEmpty()) {
				int rv = q.poll();// remove src
				
				if(vis.contains(rv)) {// check visited
					return false; // cyclic
				}
				
				vis.add(rv);// mark visited
				
				
				for (int nbr : graph.get(rv).keySet()) { // add nbrs
					if(!vis.contains(nbr)) {//nbr not visited
						q.offer(nbr);
					}
				}
			}
		}
		return count ==1;
	}
	
	
}
