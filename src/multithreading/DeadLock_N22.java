package multithreading;

public class DeadLock_N22 {
	public static void main(String[] args) {
		String lock1 = "lock1";
		String lock2 = "lock2";
		
		Thread thread1 = new Thread(() -> {
			synchronized (lock1) {
				System.out.println("Inside thread1 lock1");
				synchronized (lock2) {
					System.out.println("Inside thread1 lock2");
				}
			}
			
		});
		
		Thread thread2 = new Thread(() -> {
			synchronized (lock2) {
				System.out.println("Inside thread2 lock2");
				synchronized (lock1) {
					System.out.println("Inside thread2 lock1");
				}
			}
			
		});
		
		thread1.start();
		thread2.start();
	}
}
