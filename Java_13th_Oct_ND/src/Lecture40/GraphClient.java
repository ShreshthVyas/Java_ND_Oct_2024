package Lecture40;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.addEdge(1, 2, 30);
		g.addEdge(1, 3, 40);
		g.addEdge(2, 4, 70);
		g.addEdge(2, 5, 90);
		g.addEdge(3, 4, 60);
		g.addEdge(5,6 , 10);
		g.addEdge(5, 7, 110);
		g.addEdge(6, 7, 130);
//		g.removeVertice(2);
//		System.out.println(g.containsEdge(6, 1));
//		g.removeEdge(5, 7);
//		System.out.println(g.HasPath(4, 7));
//		g.Display();
		
//		g.PrintAllPath(1, 7);
		
		System.out.println(g.bfs(1, 7));
		System.out.println(g.dfs(1, 7));
		
		
	}

}
