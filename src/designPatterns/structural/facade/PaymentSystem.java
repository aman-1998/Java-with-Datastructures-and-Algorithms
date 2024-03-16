package designPatterns.structural.facade;

public class PaymentSystem {
	
	public void acceptCard() {
		System.out.println("Payment accepted via card");
	}
	
	public void acceptUPI() {
		System.out.println("Payment accepted via UPI");
	}
}
