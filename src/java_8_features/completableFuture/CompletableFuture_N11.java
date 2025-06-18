package java_8_features.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture_N11 {
	
	public static void main(String[] args) {
		
		CompletableFuture.supplyAsync(() -> {
			
			int[] arr = {1, 2, 3};
			try {
				return arr[3];
			} catch(ArrayIndexOutOfBoundsException ex) {
				
			}
			return arr[2];
		}).thenAccept(result -> System.out.println("Val = " + result));
		
		CompletableFuture.supplyAsync(() -> {
			
			int a = 7;
			try {
				return a/0;
			} catch(ArithmeticException ex) {
				
			}
			return a;
		}).thenAccept(result -> System.out.println("Val = " + result));
		
		CompletableFuture.supplyAsync(() -> {
			
			int a = 7;
			return a/0;
		}).exceptionally(ex -> 21)
		  .thenAccept(result -> System.out.println("Result = " + result));
		
		
		CompletableFuture.supplyAsync(() -> {
			
			if(Math.random() < 0.5) {
				throw new RuntimeException("Oops!");
			} else {
				return "OK";
			}
		}).handle((result, ex) -> {
			if (ex != null) {
		        return "Recovered from '" + ex.getMessage() + "'";
		    } else {
		        return "Success: " + result;
		    }
		}).thenAccept(t -> System.out.println(t));
		
		
		System.out.println("Main thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
