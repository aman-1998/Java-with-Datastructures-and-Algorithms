package designPatterns.structural.adapter;

public class Main {
	public static void main(String[] args) {
		ChargeIphone chargerIphone = new ChargeIphone();
		Adapter adapter = new Adapter(new SamsungCharger());
		chargerIphone.setIphoneCharger(adapter);
		chargerIphone.charge();
	}
}
