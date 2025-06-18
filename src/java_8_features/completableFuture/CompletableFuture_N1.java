package java_8_features.completableFuture;

import java.util.concurrent.CompletableFuture;
/*
 * In CompletableFuture, if you use the static CompletableFuture.supplyAsync() or CompletableFuture.runAsync() methods 
 * without explicitly specifying an Executor, they will use the default ForkJoinPool.commonPool() as the executor service.
 * 
 * The ForkJoinPool.commonPool() is a shared pool of threads available to all CompletableFuture instances that use the 
 * default executor. It's a common pool designed for compute-intensive parallel tasks and is suitable for most 
 * general-purpose asynchronous tasks.
 * 
 */
public class CompletableFuture_N1 {
	
	public static void main(String[] args) {
		
		CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
			
			System.out.println("Run sync:-");
			for(int i = 0; i <= 5; i++) {
				System.out.println(i);
			}
		});
		
		future.thenRun(() -> {
			
			System.out.println("Run after completion of future:-");
			for(int i = 6; i <= 10; i++) {
				System.out.println(i);
			}
		});
		
		// Simulate that main thread is doing some work
		System.out.println("Main is doing some work");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread ends");
	}
}
