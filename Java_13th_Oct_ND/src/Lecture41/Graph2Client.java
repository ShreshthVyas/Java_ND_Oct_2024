package Lecture41;


public class Graph2Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph2 g = new Graph2(7);
		g.addEdge(1, 2, 30);
		g.addEdge(1, 3, 40);
		g.addEdge(2, 4, 70);
		g.addEdge(2, 5, 90);
//		g.addEdge(3, 4, 60);
//		g.addEdge(5,6 , 10);
		g.addEdge(5, 7, 110);
		g.addEdge(6, 7, 130);
//		g.addVertice(8);
		
//		g.BFT();
//		System.out.println();
//		g.DFT();
		
//		System.out.println(g.isConnected());
		System.out.println(g.isCyclic());
		
	}

}
