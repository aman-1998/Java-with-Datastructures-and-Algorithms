package java_8_features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture_N5 {
	
	public static void main(String[] args) {
		
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
			
			int sum = 0;
			for(int i = 0; i <= 5; i++) {
				sum += i;
			}
			
			System.out.println("Running future1");
			return sum;
		});
		
		CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Running future2");
		});
		
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "Hello World");
		
		//CompletableFuture.allOf(future1, future2, future3);
		CompletableFuture<Void> future4 = CompletableFuture.allOf(future1, future2, future3);
		
		future4.thenRun(() -> {
			
			System.out.println("This will be executed after future1, future2, future3 is complete");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		});
		
		System.out.println("Main thread");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}
