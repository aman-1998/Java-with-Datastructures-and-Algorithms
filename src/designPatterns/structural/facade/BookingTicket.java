package designPatterns.structural.facade;

public class BookingTicket {
	
	public void bookTicket(User user, String movieName) {
		
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
