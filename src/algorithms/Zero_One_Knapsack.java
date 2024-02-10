package algorithms;

class Obj {
	int p;
	int w;
	
	public Obj(int p, int w) {
		this.p = p;
		this.w = w;
	}
}

public class Zero_One_Knapsack {
	public static void main(String[] args) {
		Obj[] valuableObjs = new Obj[3];
		valuableObjs[0] = new Obj(10, 1);
		valuableObjs[1] = new Obj(12, 2);
		valuableObjs[2] = new Obj(28, 4);
		
		int capacity = 6;
		
		int maxProfit = maxProfit01Knapsack(valuableObjs, capacity);
		
		System.out.println(maxProfit);
	}
	
	// T = O(n*c)
	// S = O(n*c)
	private static int maxProfit01Knapsack(Obj[] valuableObjs, int capacity) {
		
		int n = valuableObjs.length;
		Obj[] obj = new Obj[n+1];
		
		for(int i = 0; i <= n-1; i++) {
			obj[i+1] = valuableObjs[i];
		}
		
		int[][] ks = new int[n+1][capacity + 1];
		
		for(int i = 0; i <= n; i++) {
			ks[i][0] = 0;
		}
		
		for(int j = 0; j <= capacity; j++) {
			ks[0][j] = 0;
		}
		
		for(int i = 1; i <= n; i++) {
			for(int w = 1; w <= capacity; w++) {
				if(w >= obj[i].w) {
					ks[i][w] = Math.max(obj[i].p + ks[i-1][w-obj[i].w], ks[i-1][w]);
				} else {
					ks[i][w] = ks[i-1][w];
				}
			}
		}
		
		return ks[n][capacity];
	}
}
