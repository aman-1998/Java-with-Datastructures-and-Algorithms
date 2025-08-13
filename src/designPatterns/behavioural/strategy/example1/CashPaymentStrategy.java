package designPatterns.behavioural.strategy.example1;

public class CashPaymentStrategy implements PaymentStrategy {
	
	@Override
	public void processPayment(int amount) {
		System.out.println("Pay Rs. " + amount + " using cash");
	}
}
