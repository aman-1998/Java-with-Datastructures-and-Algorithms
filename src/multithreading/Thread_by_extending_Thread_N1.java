package multithreading;

public class Thread_by_extending_Thread_N1 {
	public static void main(String[] args) {
		Counter thread1 = new Counter(5);
		Counter thread2 = new Counter(2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("Main");
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("This is main thread: " + Thread.currentThread().getName());
	}
}

class Counter extends Thread {
	private int count;
	
	public Counter(int count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		
		while(this.count-- > 0) {
			System.out.println("Running thread: "+ Thread.currentThread().getName());
		}
	}
}