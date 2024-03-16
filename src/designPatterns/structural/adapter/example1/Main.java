package designPatterns.structural.adapter.example1;
/*
 * 
 * Usage: 
 * 1. Arrays.asList(1, 2, 3)
 * 
 * When to use:
 * When an Interface is not compatible with a class but we still want to implement that interface. 
 * This is generally used when we write new codes and make them compatible with older codes. 
 * So, we make adapter class for newClasses so that they become compatible with older interfaces.
 * 
 */
public class Main {
	public static void main(String[] args) {
		ChargeIphone chargerIphone = new ChargeIphone();
		Adapter adapter = new Adapter(new SamsungCharger());
		chargerIphone.setIphoneCharger(adapter);
		chargerIphone.charge();
	}
}
