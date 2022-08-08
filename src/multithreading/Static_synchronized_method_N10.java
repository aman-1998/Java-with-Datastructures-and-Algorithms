package multithreading;

public class Static_synchronized_method_N10 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			for(int i = 1; i <= 4; i++) {
				ThirdBracket.printThirdBrackets();
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for(int i = 1; i <= 4; i++) {
				ThirdBracket.printThirdBrackets();
			}
		});
		thread1.setName("Thread1");
		thread2.setName("Thread2");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main thread ended");
	}
}

class ThirdBracket {
	synchronized public static void printThirdBrackets() {
		for(int i = 1; i <= 10; i++) {
			if(i <=5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}
		}
		System.out.println(" Printed by therad "+Thread.currentThread().getName());
	}
}