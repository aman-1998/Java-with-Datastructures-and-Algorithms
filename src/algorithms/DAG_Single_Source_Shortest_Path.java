package algorithms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DAG_Single_Source_Shortest_Path {
	static int[] dis;
	public static void main(String[] args) {
		int[][] G = {{0,2,6,0,0,0},
					 {0,0,7,4,2,0},
					 {0,0,0,-1,1,0},
					 {0,0,0,0,-2,0},
					 {0,0,0,0,0,0},
					 {5,3,0,0,0,0}};
		
		
		int  n = G.length;
		singleSourceShortestPathInDAG(G, n, 0); // O(V + E)
		for(int i : dis) {
			System.out.print(i + " ");
		}
	}
	
	private static void singleSourceShortestPathInDAG(int[][] G, int n, int src) {
		
		int [] topoligicallySortedOrderOfVertices = topologicalSorting(G, n); // O(V+E)
		dis = new int[n];
		
		for(int i = 0; i <= n-1; i++) {
			if(i == src) {
				dis[i] = 0;
			} else {
				dis[i] = 9999; // infinity
			}
		}
		
		for(int i = 0; i <= topoligicallySortedOrderOfVertices.length-1 ; i++) { // O(E)
			int v = topoligicallySortedOrderOfVertices[i];
			for(int j = 0; j <= n-1; j++) {
				if(G[v][j] != 0) {
					if(dis[v] + G[v][j] < dis[j]) {
						dis[j] = dis[v] + G[v][j];
					}
				}
			}
		}
		
	}

	private static int[] topologicalSorting(int[][] G, int n) { // O(V + E)
		
		int[] indegree = new int[n];
		Arrays.fill(indegree, 0);
		
		for(int i = 0; i<= n-1; i++) {
			for(int j = 0; j <= n-1; j++) {
				if(G[j][i] != 0) {
					indegree[i]++;
				}
			}
		}
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 0; i <= n-1; i++) {
			if(indegree[i] == 0) {
				queue.add(i);
			}
		}
		
		int [] topoligicallySortedOrderOfVertices = new int[n]; 
		int x = 0;
		
		while(!queue.isEmpty()) {
			
			int v = queue.remove();
			topoligicallySortedOrderOfVertices[x++] = v;
			indegree[v]--;
			
			for(int i = 0; i <= n-1; i++) {
				if(G[v][i] != 0) {
					indegree[i]--;
					if(indegree[i] == 0) {
						queue.add(i);
					}
				}
			}
		}
		
		return topoligicallySortedOrderOfVertices;
	}
	
}
