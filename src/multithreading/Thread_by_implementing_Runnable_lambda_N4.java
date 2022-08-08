package multithreading;

public class Thread_by_implementing_Runnable_lambda_N4 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			int count = 5;
			while(count-- > 0) {
				System.out.println("Running thread 1");
			}
			
		});
		
		Thread thread2 = new Thread(() -> {
			int count = 5;
			while(count-- > 0) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Running thread 2");
			}
		});
		
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
