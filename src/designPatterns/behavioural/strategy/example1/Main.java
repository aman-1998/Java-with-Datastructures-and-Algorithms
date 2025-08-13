package designPatterns.behavioural.strategy.example1;

public class Main {
	
	public static void main(String[] args) {
		
		PaymentStrategy paymentStrategy1 = new UpiPaymentStrategy("9123703425", 46634);
		
		Card card = new Card("9172736535533", 455, "24/31");
		PaymentStrategy paymentStrategy2 = new CardPaymentStrategy(card);
		
		PaymentStrategy paymentStrategy3 = new CashPaymentStrategy();
		
		paymentStrategy1.processPayment(500);
		paymentStrategy2.processPayment(500);
		paymentStrategy3.processPayment(500);
	}
}
