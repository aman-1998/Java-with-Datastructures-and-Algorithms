package designPatterns.structural.facade;

public class NotificationSystem {
	
	public void sendEmail(User user, int ticketNo) {
		System.out.println("Email sent to " + user.getUsername() + " on " + user.getEmail() + " for ticket no. "+ ticketNo);
	}
	
	public void sendSms(User user, int ticketNo) {
		System.out.println("SMS sent to " + user.getUsername() + " on " + user.getPhone() + " for ticket no. "+ ticketNo);
	}
}
