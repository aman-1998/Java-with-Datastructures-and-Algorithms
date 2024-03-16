package java_8_features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture_N6 {
	
	public static void main(String[] args) {
		
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
			
			int sum = 0;
			for(int i = 1; i <= 5; i++) {
				sum += i; 
			}
			return sum;
		});
		
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
			
			int p = 1;
			for(int i = 1; i <= p; i++) {
				p = p * i;
			}
			return p;
		});
		
		CompletableFuture<Void> future3 = CompletableFuture.runAsync(() -> {
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Running future3");
		});
		
		CompletableFuture.allOf(future1.thenAccept(result -> System.out.println("Sum = " + result)),
								future2.thenApply(result -> result*2)
									   .thenAccept(result -> System.out.println("2*Factorial = " + result)),
							    future3.thenAccept(result -> System.out.println("Hello! world")));
		
		System.out.println("Main method");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
