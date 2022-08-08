package multithreading;

public class Synchronized_method_N5 {
	public static void main(String[] args) {
		Bracket bracket = new Bracket();
		
		Thread thread1 = new Thread(() -> {
			bracket.printBrackets();
		});
		
		Thread thread2 = new Thread(() -> {
			bracket.printBrackets();
		});
		
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

class Bracket {
	synchronized public void printBrackets() {
		for(int i = 1; i <= 10; i++) {
			if(i <=5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}
		}
		System.out.println();
	}
}