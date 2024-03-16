package designPatterns.structural.facade;
/*
 * Usage : It is used to structure objects and classes so that complex operations which need series of small 
 * operations can be performed in a cleaner way with less code.
 * 
 * Only advantage, No disadvantage
 * 
 */
public class Main2 {
	
	public static void main(String[] args) {
		
		User user = new User("rishav", "rishav.bhardwaj@gmail.com", "123456789");
		String movieName = "Animal";
		
		BookingTicket bookTicket = new BookingTicket();
		bookTicket.bookTicket(user, movieName);
	}
}
