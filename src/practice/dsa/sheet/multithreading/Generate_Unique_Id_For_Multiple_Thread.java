package practice.dsa.sheet.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Generate_Unique_Id_For_Multiple_Thread {
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(() -> {
			int uniqueId = SequenceGenerator.getUniqueId();
			System.out.println("Thread1 id : " + uniqueId);
		});
		
		Thread thread2 = new Thread(() -> {
			int uniqueId = SequenceGenerator.getUniqueId();
			System.out.println("Thread2 id : " + uniqueId);
		});
		
		Thread thread3 = new Thread(() -> {
			int uniqueId = SequenceGenerator.getUniqueId();
			System.out.println("Thread3 id : " + uniqueId);
		});
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
	
}

/*
 * Even though multiple threads are accessing SequenceGenerator simultaneously. 
 * Each one of them will get unique id.
 */
class SequenceGenerator {
	
	private static AtomicInteger atomicInteger = new AtomicInteger(1);
	
	public static int getUniqueId() {
		return atomicInteger.getAndIncrement();
	}
}
