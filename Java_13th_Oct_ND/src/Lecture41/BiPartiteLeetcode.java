package Lecture41;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BiPartiteLeetcode {

	public boolean isBipartite(int[][] graph) {
		Queue<bipair> q = new LinkedList<>();
		HashMap<Integer,Integer> vis = new HashMap<>();
		
		for (int i = 0 ;i<graph.length;i++) {
			if(vis.containsKey(i)) {
				continue;
			}
			q.add(new bipair(i, 0));// add src
			
			while(!q.isEmpty()) {
				bipair rv = q.poll();// remove src
				
				if(vis.containsKey(rv.v)) {// true if cycle present
					if(vis.get(rv.v)!= rv.d) { // odd length cycle
						return false;
					}
				}
				
				vis.put(rv.v, rv.d);
				
				for (int nbr : graph[rv.v]) { // add nbrs
					if(!vis.containsKey(nbr)) {//nbr not visited
						q.offer(new bipair(nbr,rv.d +1));
					}
				}
			}
		}
		return true;
	}

	public class bipair {
		int v;
		int d;

		public bipair(int val, int dist) {
			v = val;
			d = dist;
		}
	}
}
