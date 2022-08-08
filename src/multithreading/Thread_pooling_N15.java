package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_pooling_N15 {
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		PrintMessage thread1 = new PrintMessage(1);
		PrintMessage thread2 = new PrintMessage(2);
		PrintMessage thread3 = new PrintMessage(3);
		PrintMessage thread4 = new PrintMessage(4);
		PrintMessage thread5 = new PrintMessage(5);
		PrintMessage thread6 = new PrintMessage(6);
		PrintMessage thread7 = new PrintMessage(7);
		PrintMessage thread8 = new PrintMessage(8);
		PrintMessage thread9 = new PrintMessage(9);
		PrintMessage thread10 = new PrintMessage(10);
		PrintMessage thread11 = new PrintMessage(11);
		PrintMessage thread12 = new PrintMessage(12);
		PrintMessage thread13 = new PrintMessage(13);
		
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

class PrintMessage extends Thread {
	
	private int number;
	
	public PrintMessage(int number) {
		this.number = number;
	}

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
