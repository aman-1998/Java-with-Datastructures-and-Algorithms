package multithreading;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread_pooling_N18 {
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
		
		executorService.submit(thread13);
		executorService.submit(thread1);
		
		
		Callable<Integer> callable1 = () -> {
			// Your code
			Thread.sleep(3000);
			return 4+5;
		};
		Future<Integer> res1 =  executorService.submit(callable1);
		
		Future<Integer> res2 = executorService.submit(() -> {
			// Your code
			Thread.sleep(3000);
			return 8+7;
		});
		
		Testing testing = new Testing(20 , 30);
		Future<Integer> res3 = executorService.submit(testing);
		
		
		try {
			System.out.println(res1.get() + " | " + res2.get() + " | " + res3.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main thread ends...");
		
		executorService.shutdown();
	}
}


class Testing implements Callable<Integer> {
	
	private int x;
	
	private int y;
	
	public Testing(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public Integer call() throws Exception {
		int result = x + y;
		return result;
	}
}
