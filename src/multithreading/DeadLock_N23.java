package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock_N23 {
	public static void main(String[] args) {
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		
		Thread thread1 = new Thread(() -> {
			lock1.lock();
				System.out.println("Inside thread1 lock1");
				lock2.lock();
					System.out.println("Inside thread1 lock2");
				lock2.unlock();
			lock1.unlock();
		});
		
		Thread thread2 = new Thread(() -> {
			lock2.lock();
				System.out.println("Inside thread2 lock2");
				lock1.lock();
					System.out.println("Inside thread2 lock1");
				lock1.unlock();
			lock2.unlock();
		});
		
		thread1.start();
		thread2.start();
	}
}
