package multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class Counting_Semaphore_N1 {
	
	public static void main(String[] args) {
		
		Semaphore washRoomPermits = new Semaphore(3);
		try {
			
			washRoomPermits.acquire();
			System.out.println("Permission to use washroom granted to Ramesh. Using washroom...");
			
			washRoomPermits.acquire();
			System.out.println("Permission to use washroom granted to Sumit. Using washroom...");
			
			washRoomPermits.acquire();
			System.out.println("Permission to use washroom granted to Akash. Using washroom...");
			
			System.out.println("Washroom is full so plz wait Aman...");
			washRoomPermits.acquire();
			System.out.println("Permission to use washroom granted to Aman. Using washroom...");
			
			
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
	}
}
