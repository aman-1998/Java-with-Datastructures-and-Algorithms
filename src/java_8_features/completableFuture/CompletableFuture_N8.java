package java_8_features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture_N8 {
	
	public static void main(String[] args) {
		
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
			
			int sum = 0;
			for(int i = 1; i <= 10; i++) {
				sum += i;
			}
			return sum;
		});
		
		CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello World");
		});
		
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "Hey! there I am using watsapp");
		
		CompletableFuture<Object> futureWhichCompletesFirst = CompletableFuture.anyOf(future1, future2, future3);
		
		futureWhichCompletesFirst.thenAccept(result -> {
			if(result instanceof String) {
				System.out.println("result instanceof String: " + result);
			} else if(result instanceof Integer) {
				System.out.println("result instanceof Integer: " + "Sum = " + result);
			} else if(result instanceof Void) {
				System.out.println("result instanceof Void: " + "Void = " + result);
			}
		});
		
		System.out.println("Main Thread");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
