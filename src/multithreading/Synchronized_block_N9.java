package multithreading;

public class Synchronized_block_N9 {
	public static void main(String[] args) {
		AngularBrace angularBrace1 = new AngularBrace();
		AngularBrace angularBrace2 = new AngularBrace();
		
		Thread thread1 = new Thread(() -> {
			synchronized (angularBrace1) {
				for(int i = 1; i <= 4; i++) {
					angularBrace1.printAngularBraces();
				}
			}
		});
		
		Thread thread2 = new Thread(() -> {
			synchronized (angularBrace2) {
				for(int i = 1; i <= 4; i++) {
					angularBrace2.printAngularBraces();
				}
			}
		});
		
		/*
		 * thread with higher priority will have higher chance of execution first than thread 
		 * with lower priority.
		 */
		thread1.setPriority(1);
		thread2.setPriority(10);
		
		thread1.setName("Thread1");
		thread2.setName("Thread2");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main thread ended");
	}
}

class AngularBrace {
	public void printAngularBraces() {
		for(int i = 1; i <= 10; i++) {
			if(i <=5) {
				System.out.print("<");
			} else {
				System.out.print(">");
			}
		}
		System.out.println(" Printed by therad "+Thread.currentThread().getName());
	}
}