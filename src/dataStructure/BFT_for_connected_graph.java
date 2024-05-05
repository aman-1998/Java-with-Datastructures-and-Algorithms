package dataStructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
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
		in.close();
		// Breadth-First Traversal for connected graph
		String result = BFT(Graph, startingVertex);
		System.out.println("Result: "+result);
	}
	
	private static String BFT(int[][] G, int start) {
		
		int n = G.length;
		
		// Array to keep track of vertices which are visited and which are not
		int[] visited = new int[n+1];
		Arrays.fill(visited, 0);
		
		// Queue to store unexplored vertices
		Queue<Integer> queue = new LinkedList<Integer>();
		
		visited[start] = 1;
		queue.add(start);
		
		String result = "";
		
		while(!queue.isEmpty()) {
			int val = queue.remove();
			
			for(int i=1; i <= n; i++) {
				if(G[val][i] != 0) {
					if(visited[i] == 0) {
						visited[i] = 1;
						result = result + i;
						queue.add(i);
					}
				}
			}
		}
		
		return result;
	}
}
