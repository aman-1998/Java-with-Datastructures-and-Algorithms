package multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class Counting_Semaphore_N3 {
	
	public static void main(String[] args) {
		
		Semaphore washRoomPermits = new Semaphore(3);
		try {
			
			washRoomPermits.acquire(2);
			System.out.println("Permission to use washroom granted to Ramesh. Using washroom...");
			System.out.println("Permission to use washroom granted to Sumit. Using washroom...");
			
			washRoomPermits.acquire();
			System.out.println("Permission to use washroom granted to Akash. Using washroom...");
			
			washRoomPermits.release(2); // Two people left the washroom
			System.out.println("Two people left the washroom");
			
			washRoomPermits.acquire();
			System.out.println("Permission to use washroom granted to Aman. Using washroom...");
			
			washRoomPermits.acquire();
			System.out.println("Permission to use washroom granted to Deepak. Using washroom...");
			
			
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
	}
}
