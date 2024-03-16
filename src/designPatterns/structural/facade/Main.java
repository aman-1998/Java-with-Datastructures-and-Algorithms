package designPatterns.structural.facade;

public class Main {
	
	public static void main(String[] args) {
		
		User user = new User("rishav", "rishav.bhardwaj@gmail.com", "123456789");
		
		String movieName = "Animal";
		
		TicketSystem ts = new TicketSystem();
		if(ts.validateAvailability(movieName)) {
			ts.createTicket(100, movieName);
			
			PaymentSystem ps = new PaymentSystem();
			ps.acceptUPI();
			
			NotificationSystem ns = new NotificationSystem();
			ns.sendEmail(user, 100);
			ns.sendSms(user, 100);
		}
	}
	
}
