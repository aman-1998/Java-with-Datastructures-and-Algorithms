package dataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class DFT_for_connected_graph {
	
	private static ArrayList<Integer> visited = new ArrayList<Integer>();
	private static String result = null;
	
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
		String result = DFT(Graph, 8, startingVertex);
		System.out.println(result);
	}

	private static String DFT(int[][] Graph, int n, int startingVertex) {
		for(int i = 0; i <= n; i++) {
			visited.add(0);
		}
		
		result = DFS(Graph, n, startingVertex);
		
		for(int i = 1; i <= n; i++) {
			if(visited.get(i) == 0) {
				result = result + " " + DFS(Graph, n, i);
			}
		}
		return result;
	}

	private static String DFS(int[][] Graph, int n, int startingVertex) {
		visited.set(startingVertex, 1);
		result = String.valueOf(startingVertex);
		int v = startingVertex;
		for(int i = 1; i <= n ; i++) {
			if(Graph[v][i] == 1 && visited.get(i) == 0) {
				result = result + " "+ DFS(Graph, n, i);
			}
		}
		return result;
	}
}
