package designPatterns.structural.adapter.example1;

public class Iphone6Charger implements IphoneCharger {

	@Override
	public void supplyPowerToIphones() {
		System.out.println("Supply power to Iphone6");
	}

}
