package designPatterns.structural.adapter.example1;

public class SamsungM31Charger implements SamsungCharger {

	@Override
	public void supplyPowerToSamsungPhone() {
		System.out.println("Supply power to Samsung");
	}

}
