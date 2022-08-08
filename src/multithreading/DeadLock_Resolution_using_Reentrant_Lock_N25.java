package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock_Resolution_using_Reentrant_Lock_N25 {
	public static void main(String[] args) {
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		
		Thread thread1 = new Thread(() -> {
			boolean flagLock1 = false;
			boolean flagLock2 = false;
			while(true) {
				try {
					flagLock1 = lock1.tryLock(10, TimeUnit.MILLISECONDS);
					flagLock2 = lock2.tryLock(10, TimeUnit.MILLISECONDS);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if(flagLock1) {
						System.out.println("Inside thread1 lock1");
						lock1.unlock();
					}
					
					if(flagLock2) {
						System.out.println("Inside thread1 lock2");
						lock2.unlock();
					}
					
					if(flagLock1 && flagLock2) {
						break;
					}
				}
			}
		});
		
		Thread thread2 = new Thread(() -> {
			boolean flagLock1 = false;
			boolean flagLock2 = false;
			
			while(true) {
				try {
					flagLock1 = lock1.tryLock(10, TimeUnit.MILLISECONDS);
					flagLock2 = lock2.tryLock(10, TimeUnit.MILLISECONDS);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if(flagLock1) {
						System.out.println("Inside thread2 lock1");
						lock1.unlock();
					}
					
					if(flagLock2) {
						System.out.println("Inside thread2 lock2");
						lock2.unlock();
					}
					
					if(flagLock1 && flagLock2) {
						break;
					}
				}
			}
			
		});
		
		thread1.start();
		thread2.start();
	}
}
