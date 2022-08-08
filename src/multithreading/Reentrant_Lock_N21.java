package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrant_Lock_N21 {
	public static void main(String[] args) {
		Alphabet alphabet = new Alphabet();
		Lock lock = new ReentrantLock();
		Thread thread1 = new Thread(() -> {
			lock.lock();
			alphabet.printAlphabet();
			lock.unlock();
		});
		
		Thread thread2 = new Thread(() -> {
			lock.lock();
			alphabet.printAlphabet();
			lock.unlock();
		});
		
		thread1.start();
		thread2.start();
	}
}

class Alphabet {
	public void printAlphabet() {
		for(int i = 1; i <= 26; i++) {
			System.out.print((char)(i+64));
		}
		System.out.println();
	}
}
