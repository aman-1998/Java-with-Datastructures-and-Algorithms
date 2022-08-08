package multithreading;

public class Thread_by_implementing_Runnable_N2 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Count(5));
		Thread thread2 = new Thread(new Count(3));
		
		thread1.setName("Thread-1");
		thread2.setName("Thread-2");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " thread ended");
	}
}

class Count implements Runnable {
	
	private int counter;
	
	public Count(int counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		while(this.counter-- > 0) {
			System.out.println("Running thread: " + Thread.currentThread().getName());
		}
	}
	
}
