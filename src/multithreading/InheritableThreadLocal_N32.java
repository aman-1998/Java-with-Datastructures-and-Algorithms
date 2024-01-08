package multithreading;

/*
 * ThreadLocal variables are maintained per thread separately i.e., if Thread1 changes the value of its ThreadLocal 
 * variable then ThreadLocal variable of Thread2 doesn't have any effect.
 * 
 * InheritableThreadLocal is used when we want to pass the value from Parent Thread to Child Thread.
 * 
 */

public class InheritableThreadLocal_N32 {
	
	public static void main(String[] args) {
		
		Thread thread1 = new ParentThread4();
		thread1.start();
	}
}

class ParentThread4 extends Thread {
	
	public static InheritableThreadLocal<Integer> value = new InheritableThreadLocal<Integer>() {
		
		@Override
		protected Integer initialValue() {
			return 100;
		}
		
//		@Override
//		protected Integer childValue(Integer presentValue) {
//			return 400;
//		}
	};
	
	public void run() {
		Thread.currentThread().setName("Parent-Thread");
		System.out.println(Thread.currentThread().getName() + " : value = " + value.get());
		Thread childThread = new ChildThread4();
		childThread.start();
		//System.out.println(Thread.currentThread().getName() + " : value = " + value.get());
	}
}

class ChildThread4 extends Thread {
		
	public void run() {
		Thread.currentThread().setName("Child-Thread");
		System.out.println(Thread.currentThread().getName() + " : value = " + ParentThread4.value.get());
	}
}



