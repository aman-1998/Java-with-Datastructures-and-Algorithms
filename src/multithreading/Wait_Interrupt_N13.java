package multithreading;

public class Wait_Interrupt_N13 {
	private int balance = 500;
	
	public void withdraw(int amount) {
		while(amount > balance || balance == 0) {
			try {
				System.out.println("Waiting to withdraw Rs."+amount+" ...");
				synchronized (this) {
					wait();
				}
			} catch (InterruptedException e) {}
		}
		
		balance = balance - amount;
		System.out.println("Amount withdrawn = Rs."+amount);
		System.out.println("Final Balance = Rs."+balance);
	}
	
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("Rs. "+amount+" is deposited");
		System.out.println("Final Balance = Rs." + balance);
	}
	
	public static void main(String[] args) {
		Wait_Interrupt_N13 mainObj = new Wait_Interrupt_N13();
		System.out.println("Balance = Rs."+mainObj.balance);
		Thread thread1 = new Thread(() -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			mainObj.withdraw(1000);
		});
		
		Thread thread2 = new Thread(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			mainObj.deposit(700);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/*
			 * This will throw an InterruptedException if a particular thread 
			 * is in the waiting state. This exception will be thrown from the 
			 * same line where wait() is called.
			 * 
			 * If that particular thread is not waiting then even if we call 
			 * interrupt() no exception will be thrown.
			 */
			thread1.interrupt();
		});
		
		thread1.start();
		thread2.start();
	}
}
