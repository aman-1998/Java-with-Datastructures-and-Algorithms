package designPatterns.structural.facade;

public class TicketSystem {
	
	private int ticketNo;
	
	public boolean validateAvailability(String movieName) {
		return true;
	}
	
	public void createTicket(int ticketNo, String movieName) {
		System.out.println("Ticket " + ticketNo + " generated");
	}
}
