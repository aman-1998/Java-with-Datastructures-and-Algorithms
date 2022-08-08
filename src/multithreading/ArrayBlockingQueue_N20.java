package multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_N20 {
	private static int input = 1;
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		
		Thread producer = new Thread(() -> {
			while(true) {
				try {
					queue.put(input);
					System.out.println((input)+" inserted");
					input++;
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread consumer = new Thread(() -> {
			int flag = 1;
			while(true) {
				try {
					if(flag == 1) {
						Thread.sleep(11000); // first time
						flag = 2;
					} else {
						Thread.sleep(2000);
					}
					int out = queue.take();
					System.out.println(out+" is taken out");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		producer.start();
		consumer.start();
	}
}
