package multithreading;

public class Thread_by_implementing_Runnable_annonymous_N3 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run () {
				int counter = 5;
				while(counter-- > 0) {
					System.out.println("Running thread: " + Thread.currentThread().getName());
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run () {
				int counter = 10;
				while(counter-- > 0) {
					System.out.println("Running thread: " + Thread.currentThread().getName());
				}
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " thread ended");
		
	}
}
