package designPatterns.behavioural.strategy.example1;

public class CardPaymentStrategy implements PaymentStrategy {
	
	private Card card;

	public CardPaymentStrategy(Card card) {
		this.card = card;
	}
	
	@Override
	public void processPayment(int amount) {
		boolean isAuthenticated = authenticateUsingCard(card);
		
		if(isAuthenticated) {
			System.out.println("Pay Rs. " + amount + " using Card");
		} else {
			System.out.println("Incorrect PIN");
		}
	}

	private boolean authenticateUsingCard(Card card) {
		// TODO Auto-generated method stub
		return true;
	}
}
