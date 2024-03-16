package java_8_features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture_N3 {
	
	public static void main(String[] args) {
		
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
			
			System.out.println("Inside supplyAsync");
			int sum = 0;
			for(int i = 0; i <= 5; i++) {
				sum += i;
			}
			
			return sum;
		});
		
		future.thenAccept(result -> System.out.println("Sum = " + result));
		
		CompletableFuture<Integer> transformedFuture = future.thenApply(result -> {
			
			for(int i = 1; i <= 3; i++) {
				result = result+i;
			}
			
			return result;
		});
		
		transformedFuture.thenAccept(result -> System.out.println("Enhanced sum = " + result));
		
		transformedFuture.thenRun(() -> {
			
			int p = 1;
			for(int i = 1; i <= 4; i++) {
				p = p * i;
			}
			
			System.out.println("Factorial = " + p);
		});
		
		System.out.println("Main thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
}
