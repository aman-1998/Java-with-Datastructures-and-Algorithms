package java_8_features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture_N2 {
	
	public static void main(String[] args) {
		
		 CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
			 
			 System.out.println("Inside runAsync");
			 for(int i = 1; i <= 5; i++) {
				 System.out.println(i + " ");
			 }
		 });
		 
		 future.thenAccept(result -> System.out.println("Just checking"));
		 CompletableFuture<Integer> transformedFuture = future.thenApply(result -> 23636);
		 
		 transformedFuture.thenAccept(result -> System.out.println(result));
		 
		 System.out.println("Main thread");
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
