package multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatch_N19 {
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(5);
		
		Thread thread1 = new Thread(new Step("Learn Java", latch));
		Thread thread2 = new Thread(new Step("Learn Algorithms", latch));
		Thread thread3 = new Thread(new Step("Learn Data structure", latch));
		Thread thread4 = new Thread(new Step("Learn Java related frameworks", latch));
		Thread thread5 = new Thread(new Step("Learn deployment", latch));
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Get the job");
	}
}

class Step implements Runnable {
	private String msg;
	private CountDownLatch latch;
	
	public Step(String msg, CountDownLatch latch) {
		this.msg = msg;
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println(msg);
		latch.countDown();
	}
}
