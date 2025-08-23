package practice.dsa.sheet.multithreading;

import java.util.concurrent.Semaphore;

public class FooBar_Alternation {
	
public static void main(String[] args) {
		
		FooBarPrinter fooBarPrinter = new FooBarPrinter(5); // 5 times FOO and 5 times BAR
		
		Thread thread1 = new Thread(() -> {
			try {
				fooBarPrinter.printPing();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}, "thread1");
		
		Thread thread2 = new Thread(() -> {
			try {
				fooBarPrinter.printPong();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}, "thread2");
		
		thread1.start();
		thread2.start();
	}
}

class FooBarPrinter {
	
	private int limit;
	
	private Semaphore fooSemaphore = new Semaphore(1);
	private Semaphore barSemaphore = new Semaphore(0);
	
	public FooBarPrinter(int limit) {
		this.limit = limit;
	}
	
	public void printPing() throws InterruptedException {
		for(int i = 0; i < limit; i++) {
			fooSemaphore.acquire();
			System.out.println(Thread.currentThread().getName() + " - FOO");
			barSemaphore.release();
		}
	}
	
	public void printPong() throws InterruptedException {
		for(int i = 0; i < limit; i++) {
			barSemaphore.acquire();
			System.out.println(Thread.currentThread().getName() + " - BAR");
			fooSemaphore.release();
		}
	}
}
