package dataStructure;

import java.util.LinkedList;

public class Topological_sort {
	public static void main(String[] args) {
		int[][] Graph = {
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,1,0,1},
				{0,0,1,0,0,0,0},
				{0,1,0,0,0,0,0},
				{0,0,1,0,0,0,0},
				{0,1,0,0,1,0,0}
		}; // Adjacency matrix for directed graph
		int n = Graph.length - 1; // number of vertices
		String result = topologicalSort(Graph, n);
		System.out.println("Result: "+result);
	}
	
	private static String topologicalSort(int[][] Graph, int n) {
		// to store indegrees of all vertices
		int[] indegree = new int[n+1]; // all are initialized with 0 by default
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(Graph[j][i] == 1) {
					indegree[i]++;
				}
			}
		}
		
		// to store vertices with indegree 0
		LinkedList<Integer> queue = new LinkedList<Integer>();
		String result = "";
		
		for(int i = 1; i <= n; i++) {
			if(indegree[i] == 0) {
				queue.add(i);
			}
		}
		
		while(!queue.isEmpty()) {
			int v = queue.removeFirst();
			indegree[v]--; // indegree[v] = -1;
			result = result + String.valueOf(v) + " ";
			for(int i = 1; i <= n; i++) {
				if(Graph[v][i] == 1) {
					indegree[i]--;
					if(indegree[i] == 0) {
						queue.add(i);
					}
				}
			}
		}
		
		return result.trim();
	}
}
