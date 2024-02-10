package algorithms;

public class Bellman_Ford_Algorithm {
	
	public static int[] dis;
	public static void main(String[] args) {
		//int n = 5;
		int[][] G = {{0,10,5,0,0},
					 {0,0,2,1,0},
					 {0,3,0,9,2},
					 {0,0,0,0,4},
					 {7,0,0,6,0}};
			
		boolean check = bellmanFordAlgo(G, 0); // T = O(VE)
		if(check) {
			for(int i : dis) {
				System.out.print(i + " ");
			}
		}
		System.out.println("Shortest path from source to all other nodes is not possible "
				+ "as negative weight cycle exist");
	}
	
	public static boolean bellmanFordAlgo(int[][] G, int src) {
		
		int n = G.length;
		dis = new int[n];
		for(int i = 0; i <= n-1; i++) {
			if(i == src) {
				dis[i] = 0;
			} else {
				dis[i] = Integer.MAX_VALUE;
			}
		}
		
		for(int k = 1; k <= n-1; k++) { // Relaxing all edges n-1 times
			for(int i = 0; i <= n-1; i++) {
				for(int j = 0; j <= n-1; j++) {
					if(G[i][j] != 0) {
						if(dis[i] + G[i][j] < dis[j]) {
							dis[j] = dis[i] + G[i][j];
						}
					}
				}
			}
		}
		
		for(int i = 0; i <= n-1; i++) { // Relaxing all the edges 1 time .i.e nth time
			for(int j = 0; j <= n-1; j++) {
				if(G[i][j] != 0) {
					if(dis[i] + G[i][j] < dis[j]) {
						return false; // Getting better values
					}
				}
			}
		}
		
		return true;
	}
}
