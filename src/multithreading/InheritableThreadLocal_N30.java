package multithreading;

/*
 * ThreadLocal variables are maintained per thread separately i.e., if Thread1 changes the value of its ThreadLocal 
 * variable then ThreadLocal variable of Thread2 doesn't have any effect.
 * 
 * InheritableThreadLocal is used when we want to pass the value from Parent Thread to Child Thread.
 * 
 */

public class InheritableThreadLocal_N30 {
	
	public static void main(String[] args) {
		
		Thread thread1 = new ParentThread2();
		thread1.start();
	}
}

class ParentThread2 extends Thread {
	
	public static ThreadLocal<Integer> value = ThreadLocal.withInitial(() -> 900);
	
	public void run() {
		Thread.currentThread().setName("Parent-Thread");
		//value.set(100);
		System.out.println(Thread.currentThread().getName() + " : value = " + value.get());
		Thread childThread = new ChildThread2();
		childThread.start();
	}
}

class ChildThread2 extends Thread {
		
	public void run() {
		Thread.currentThread().setName("Child-Thread");
		System.out.println(Thread.currentThread().getName() + " value = " + ParentThread2.value.get());
	}
}

