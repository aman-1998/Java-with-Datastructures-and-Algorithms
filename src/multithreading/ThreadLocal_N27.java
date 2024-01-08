package multithreading;

/*
 * ThreadLocal variables are maintained per thread separately i.e., if Thread1 changes the value of its ThreadLocal 
 * variable then ThreadLocal variable of Thread2 doesn't have any effect.
 * 
 */

public class ThreadLocal_N27 {
	
	public static void main(String[] args) {
		
		CounterRunnable runnable = new CounterRunnable();
		
		Thread th1 = new Thread(runnable, "Thread1");
		Thread th2 = new Thread(runnable, "Thread2");
		
		try {
			th1.start();
			th1.join();
			th2.start();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class CounterRunnable implements Runnable {
	
	private CounterInt counter = new CounterInt();

	@Override
	public void run() {
		for(int i=1; i <= 5; i++) {
			counter.increment();
		}
		System.out.println(Thread.currentThread().getName() + " : counter = " + counter.getCounter());
	}
}

class CounterInt {
	
	private int counter = 0;
	
	public void increment() {
		counter++;
	}
	
	public int getCounter() {
		return counter;
	}
}
