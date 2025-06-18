package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_pooling_N17 {
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Thread thread1 = new Thread(() -> {
			System.out.println("Thread1 ended");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread thread2 = new Thread(() -> {
			System.out.println("Thread2 ended");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread thread3 = new Thread(() -> {
			System.out.println("Thread3 ended");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread thread4 = new Thread(() -> {
			System.out.println("Thread4 ended");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread thread5 = new Thread(() -> {
			System.out.println("Thread5 ended");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread thread6 = new Thread(() -> {
			System.out.println("Thread6 ended");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread thread7 = new Thread(() -> {
			System.out.println("Thread7 ended");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread thread8 = new Thread(() -> {
			System.out.println("Thread8 ended");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread thread9 = new Thread(() -> {
			System.out.println("Thread9 ended");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread thread10 = new Thread(() -> {
			System.out.println("Thread10 ended");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread thread11 = new Thread(() -> {
			System.out.println("Thread11 ended");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread thread12 = new Thread(() -> {
			System.out.println("Thread12 ended");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread thread13 = new Thread(() -> {
			System.out.println("Thread13 ended");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		executorService.execute(thread1);
		executorService.execute(thread2);
		executorService.execute(thread3);
		executorService.execute(thread4);
		executorService.execute(thread5);
		executorService.execute(thread6);
		executorService.execute(thread7);
		executorService.execute(thread8);
		executorService.execute(thread9);
		executorService.execute(thread10);
		executorService.execute(thread11);
		executorService.execute(thread12);
		executorService.execute(thread13);
		
		executorService.execute(() -> {
			System.out.println("Thread14 ended");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		executorService.submit(thread1);
		
		executorService.shutdown();
	}
}
