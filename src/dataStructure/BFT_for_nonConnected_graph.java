package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Scanner;

public class BFT_for_nonConnected_graph {
	
	private static ArrayList<Integer> visited = new ArrayList<>();
	
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
		String result = BFT(Graph, n, startingVertex).get();
		System.out.println("Result: "+result);
	}
	
	private static Optional<String> BFT(int[][] Graph, int n, int startingVertex) {
		for(int i = 0; i <= n; i++) {
			visited.add(0);
		}
		
		String result = BFS(Graph, n, startingVertex).get();
		
		for(int i = 1; i <= n; i++) {
			if(visited.get(i) == 0) {
				result = result +" "+ BFS(Graph, n, i).get();
			}
		}
		return Optional.ofNullable(result);
	}

	private static Optional<String> BFS(int[][] Graph, int n, int startingVertex) {
		// Queue to store unexplored vertices
		LinkedList<Integer> queue = new LinkedList<>();
		
		visited.set(startingVertex, 1);
		String result = String.valueOf(startingVertex);
		int v = startingVertex;
		
		while(true) {
			for(int i = 1; i <= n; i++) { // for all vertices which are adjacent to v
				if(Graph[v][i] == 1 && visited.get(i) == 0) {
					visited.set(i, 1);
					result = result +" "+ String.valueOf(i);
					queue.add(i);
				}
			}
			if(queue.isEmpty()) {
				return Optional.ofNullable(result);
			} else {
				v = queue.removeFirst();
			}
		}
	}
}
