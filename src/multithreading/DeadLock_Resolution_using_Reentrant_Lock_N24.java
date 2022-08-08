package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock_Resolution_using_Reentrant_Lock_N24 {
	public static void main(String[] args) {
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		
		Thread thread1 = new Thread(() -> {
			boolean flagLock1 = false;
			boolean flagLock2 = false;
			boolean done1 = false;
			boolean done2 = false;
			while(true) {
				try {
					if(!done1) {
						flagLock1 = lock1.tryLock();
					}
					
					if(!done2) {
						flagLock2 = lock2.tryLock();
					}
				} finally {
					if(flagLock1 && !done1) {
						System.out.println("Inside thread1 lock1");
						lock1.unlock();
						done1 = true;
					}
					
					if(flagLock2 && !done2) {
						System.out.println("Inside thread1 lock2");
						lock2.unlock();
						done2 = true;
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
			boolean done1 = false;
			boolean done2 = false;
			while(true) {
				try {
					if(!done1) {
						flagLock1 = lock1.tryLock();
					}
					
					if(!done2) {
						flagLock2 = lock2.tryLock();
					}
				} finally {
					if(flagLock1 && !done1) {
						System.out.println("Inside thread2 lock1");
						lock1.unlock();
						done1 = true;
					}
					
					if(flagLock2 && !done2) {
						System.out.println("Inside thread2 lock2");
						lock2.unlock();
						done2 = true;
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
