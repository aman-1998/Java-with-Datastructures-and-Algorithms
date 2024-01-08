package multithreading;

/*
 * ThreadLocal variables are maintained per thread separately i.e., if Thread1 changes the value of its ThreadLocal 
 * variable then ThreadLocal variable of Thread2 doesn't have any effect.
 * 
 * InheritableThreadLocal is used when we want to pass the value from Parent Thread to Child Thread.
 * 
 */

public class InheritableThreadLocal_N31 {
	
	public static void main(String[] args) {
		
		Thread thread1 = new ParentThread3();
		thread1.start();
	}
}

class ParentThread3 extends Thread {
	
	public static InheritableThreadLocal<Integer> value = new InheritableThreadLocal<Integer>() {
		
		@Override
		protected Integer childValue(Integer presentValue) {
			return 400;
		}
	};
	
	public void run() {
		Thread.currentThread().setName("Parent-Thread");
		value.set(200);
		System.out.println(Thread.currentThread().getName() + " : value = " + value.get());
		Thread childThread = new ChildThread3();
		childThread.start();
		//System.out.println(Thread.currentThread().getName() + " : value = " + value.get());
	}
}

class ChildThread3 extends Thread {
		
	public void run() {
		Thread.currentThread().setName("Child-Thread");
		System.out.println(Thread.currentThread().getName() + " : value = " + ParentThread3.value.get());
	}
}