package multithreading;

public class Volatile_variable_and_Anonymous_Thread_N11 {
	volatile private static int flag = 0;
	public static void main(String[] args) {
		new Thread(() -> {
			for(int i = 1; i <= 20; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(flag == 0) {
					System.out.println("Flag value is 0");
				} else {
					System.out.println("Flag value is 1");
				}
			}
		}).start();
		
		new Thread(() -> {
			try {
				Thread.sleep(17000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			flag = 1;
		}).start();
		
		/*
		 * It is possible that after 17 seconds flag becomes 1 but
		 * thread1 still prints flag value 0 due to caching. So, we use
		 * volatile keyword to prevent a variable from being cached.
		 */
	}
}
