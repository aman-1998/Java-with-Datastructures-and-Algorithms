package multithreading;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_pooling_N16 {
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Thread thread1 = new Thread(new Message(1));
		Thread thread2 = new Thread(new Message(2));
		Thread thread3 = new Thread(new Message(3));
		Thread thread4 = new Thread(new Message(4));
		Thread thread5 = new Thread(new Message(5));
		Thread thread6 = new Thread(new Message(6));
		Thread thread7 = new Thread(new Message(7));
		Thread thread8 = new Thread(new Message(8));
		Thread thread9 = new Thread(new Message(9));
		Thread thread10 = new Thread(new Message(10));
		Thread thread11 = new Thread(new Message(11));
		Thread thread12 = new Thread(new Message(12));
		Thread thread13 = new Thread(new Message(13));
		
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
	}
}

class Message implements Runnable {
	
	private int number;

	public Message(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("Thread"+number+" ended");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}