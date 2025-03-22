package Lecture40;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
		
	private HashMap<Integer, HashMap<Integer , Integer>> graph;
	
	public Graph(int v) {
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
	
	public void removeVertice(int v) {
		for (int  nbrs : graph.get(v).keySet()) {
			graph.get(nbrs).remove(v);
		}
		graph.remove(v);
	}
	public void removeEdge(int v1,int v2) {
		graph.get(v1).remove(v2);
		graph.get(v2).remove(v1);
	}
	
	public boolean containsEdge(int v1,int v2) {
		return graph.get(v1).containsKey(v2);
	}
	
	public boolean containsVertice(int v) {
		return graph.containsKey(v);
	}
	
	public void Display() {
		for (int i : graph.keySet()) {
			System.out.println(i + " ==> " + graph.get(i));
		}
	}
	public boolean HasPath(int src, int dest) {
		return hasPath(src, dest, new HashSet<Integer>());
	}
	
	private boolean hasPath(int src,int dest,HashSet<Integer>visited) {
		if(src == dest) {
			return true;
		}
		visited.add(src);// src marked visited
		for (int  nbr : graph.get(src).keySet()) {
			if(!visited.contains(nbr)) {
				boolean ans = hasPath(nbr, dest,visited);
				if(ans == true) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void PrintAllPath(int src, int dest) {
		 printpath(src, dest, new HashSet<Integer>(),src+"==> ");
	}

	private void printpath(int src, int dest, HashSet<Integer> visited,String s) {
		// TODO Auto-generated method stub
		
		if(src == dest) {
			s+="End";
			System.out.println(s);
			return;
		}
		visited.add(src);// src marked visited
		for (int  nbr : graph.get(src).keySet()) {
			if(!visited.contains(nbr)) {
				printpath(nbr, dest,visited, s + nbr +"==> ");
			}
		}
		visited.remove(src);
		
	}
	
	public boolean bfs(int src,int dest) {
		if(src == dest) {
			return true;
		}
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> vis = new HashSet<>();
		
		q.add(src);// add src
		
		while(!q.isEmpty()) {
			int rv = q.poll();// remove src
			
			if(rv == dest) { // path found
				return true;
			}
			
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
		
		return false;
		
	}
	public boolean dfs(int src,int dest) {
		if(src == dest) {
			return true;
		}
		Stack<Integer> q = new Stack<>();
		HashSet<Integer> vis = new HashSet<>();
		
		q.add(src);// add src
		
		while(!q.isEmpty()) {
			int rv = q.pop();// remove src
			
			if(rv == dest) { // path found
				return true;
			}
			
			if(vis.contains(rv)) {// check visited
				continue;
			}
			
			vis.add(rv);// mark visited
			
			for (int nbr : graph.get(rv).keySet()) { // add nbrs
				if(!vis.contains(nbr)) {//nbr not visited
					q.push(nbr);
				}
			}
		}
		
		return false;
		
	}
	
	
	
	
	
	
	
	
}
