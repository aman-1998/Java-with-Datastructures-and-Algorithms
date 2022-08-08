package multithreading;

public class Wait_Notify_N12 {
	private int balance = 500;
	
	public void withdraw(int amount) {
		while(amount > balance || balance == 0) {
			try {
				System.out.println("Waiting to withdraw Rs."+amount+" ...");
				synchronized (this) {
					wait();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		balance = balance - amount;
		System.out.println("Amount withdrawn = Rs."+amount);
		System.out.println("Final Balance = Rs."+balance);
	}
	
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("Rs. "+amount+" is deposited");
		System.out.println("Final Balance = Rs." + balance);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (this) {
			/*
			 * If a thread is waiting then notify() will inform him not to wait anymore.
			 * If no thread is waiting and still notify() is called then there is no body to inform. So, it will do noting.
			 * If multiple threads are waiting then the one which highest priority or which is waiting for the maximum time will be notified first.
			 */
			notify();
		}
	}
	
	public static void main(String[] args) {
		Wait_Notify_N12 mainObj = new Wait_Notify_N12();
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
		});
		
		thread1.start();
		thread2.start();
	}
}
