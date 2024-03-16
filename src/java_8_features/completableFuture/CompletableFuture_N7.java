package java_8_features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture_N7 {
	
	public static void main(String[] args) {
		
		CompletableFuture.allOf(
				CompletableFuture.supplyAsync(() -> {
					int sum = 0;
					for(int i = 1; i <= 5; i++) {
						sum += i;
					}
					return sum;
					
				}).thenAccept(result -> System.out.println("Sum = " + result)),
				CompletableFuture.runAsync(() -> {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Hi! here I am");
				}),
				CompletableFuture.supplyAsync(() -> "Hello! World")
								 .thenApply(result -> result.toUpperCase())
								 .thenAccept(result -> System.out.println("Result = " + result))
		);
		
		System.out.println("Main Thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
