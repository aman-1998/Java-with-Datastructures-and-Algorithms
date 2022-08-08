package multithreading;

public class Synchronized_method_N6 {
	public static void main(String[] args) {
		Brackets bracket = new Brackets();
		
		Thread thread1 = new Thread(() -> {
			for(int i = 1; i <= 4; i++) {
				bracket.printBrackets();
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for(int i = 1; i <= 4; i++) {
				bracket.printBrackets();
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

class Brackets {
	synchronized public void printBrackets() {
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