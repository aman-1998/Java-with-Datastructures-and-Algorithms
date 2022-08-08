package dataStructure;

import java.util.LinkedList;
import java.util.Scanner;

public class BFT_for_connected_graph {
	
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
		System.out.print("Enter the vertex to start with: ");
		int startingVertex = in.nextInt();
		int n = Graph.length - 1; // number of vertices
		// Breadth-First Traversal for connected graph
		String result = BFT(Graph, n, startingVertex);
		System.out.println("Result: "+result);
	}
	
	private static String BFT(int[][] Graph, int n, int startingVertex) {
		// Array to keep track of vertices which are visited and which are not
		int[] visited = new int[n+1];
		
		// Mark all vertices as unvisited (initially)
		for(int i=0; i<= n; i++) {
			visited[i] = 0;
		}
		
		// Queue to store unexplored vertices
		LinkedList<Integer> queue = new LinkedList<>();
		
		visited[startingVertex] = 1;
		String result = String.valueOf(startingVertex);
		int v = startingVertex;
		
		while(true) {
			for(int i = 1; i <= n; i++) { // for all vertices which are adjacent to v
				if(Graph[v][i] == 1 && visited[i] == 0) {
					visited[i] = 1;
					result = result +" "+ String.valueOf(i);
					queue.add(i);
				}
			}
			if(queue.isEmpty()) {
				return result;
			} else {
				v = queue.removeFirst();
			}
		}
	}
}
