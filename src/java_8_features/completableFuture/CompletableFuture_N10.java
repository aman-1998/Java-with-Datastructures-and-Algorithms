package java_8_features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture_N10 {
	
	public static void main(String[] args) {
		
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
			
			String str = "Aman Kumar Mishra";
			int sum = 0;
			for(int i = 0; i <= str.length()-1; i++) {
				sum += i;
			}
			return sum;
		});
		
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			
			String str = "";
			for(int i = 65; i <= 80; i++) {
				str = str + (char)i;
			}
			return str;
		});
		
		CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (result1, result2) -> result2 + result1);
		combinedFuture.thenAccept(result -> System.out.println("Combined result = " + result));
	}
}
