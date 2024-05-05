package java_8_features.completableFuture;

import java.util.concurrent.CompletableFuture;

/*
 * ----------------
 * NOTE:- (ChatGPT)
 * ----------------
 * The behavior you're observing, where the thenRun() method is sometimes executed by a worker thread from the 
 * common pool (ForkJoinPool.commonPool-worker-N) and sometimes by the main thread, depends on the timing and the 
 * availability of threads in the common pool.
 *
 * In general, when you use thenRun(), the callback action is executed synchronously on the same thread that completes 
 * the preceding CompletableFuture. However, if the common pool has idle threads available at the time when the 
 * preceding CompletableFuture completes, the callback might be executed by one of those idle threads to avoid creating 
 * additional overhead.
 *
 * On the other hand, if there are no idle threads available in the common pool at the time of completion, or if the 
 * common pool is busy with other tasks, the callback might be executed by the main thread instead. This fallback 
 * mechanism ensures that the callback is executed without introducing unnecessary delays.
 *
 * Therefore, the behavior you're observing is a result of the dynamic thread scheduling and availability of threads 
 * in the common pool at the time of completion of the preceding CompletableFuture. It's not deterministic and may vary 
 * based on factors such as the system load, the number of available processors, and the nature of other concurrent tasks.
 * 
 * The same concept is applicable for thenAccept(), thenApply() and thenCombine() methods.
 * 
 */

public class CompletableFuture_N2 {
	
	public static void main(String[] args) {
		
		 CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
			 
			 for(int i = 1; i <= 5; i++) {
				 System.out.println(i + " ");
			 }
			 System.out.println("Inside runAsync : " + Thread.currentThread().getName());
		 });
		 
		 future.thenAccept(result -> {
			 System.out.println("Just checking : " + Thread.currentThread().getName());
		 });
		 CompletableFuture<Integer> transformedFuture = future.thenApply(result -> 23636);
		 
		 transformedFuture.thenAccept(result -> {
			 System.out.println("Result =  "+ result + " by Thread = " + Thread.currentThread().getName());
			 try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
		 });
		 
		 System.out.println("Main thread running...");
		 try {
			Thread.sleep(10000);
		 } catch (InterruptedException e) {
			
			 e.printStackTrace();
		 }
		 System.out.println("Main thread over :-)");
	}
}
