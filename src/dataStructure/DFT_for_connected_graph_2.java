package dataStructure;

import java.util.Scanner;

// This is better
public class DFT_for_connected_graph_2 {
	private static int[] visited;
	private static String result = "";
	
	public static void main(String[] args) {
		int[][] Graph = {
				{0,0,0,0,0,0,0,0,0},
				{0,0,1,1,0,0,0,0,0}, 
				{0,1,0,0,1,1,0,0,0},
				{0,1,0,0,0,0,1,1,0},
				{0,0,1,0,0,0,0,0,1},
				{0,0,1,0,0,0,0,0,1},
				{0,0,0,1,0,0,0,0,1},
				{0,0,0,1,0,0,0,0,1},
				{0,0,0,0,1,1,1,1,0}
		}; // Adjacency Matrix
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the vertex to start with: ");
		int startingVertex = in.nextInt();
		int n = Graph.length - 1; // number of vertices
		visited = new int[n+1];
		for(int i = 0; i <= n; i++) {
			visited[i] = 0;
		}
		DFT(Graph, 8, startingVertex);
		System.out.println(result);
	}
	
	//Better
	private static void DFT(int[][] Graph, int n, int startingVertex) {
		visited[startingVertex] = 1;
		result = result + startingVertex + " ";
		int v = startingVertex;
		for(int i = 1; i <= n ; i++) {
			if(Graph[v][i] == 1 && visited[i] == 0) {
				DFT(Graph, n, i);
			}
		}
	}
}
