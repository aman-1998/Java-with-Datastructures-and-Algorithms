package designPatterns.structural.adapter.example1;

public class Adapter implements IphoneCharger {

	private SamsungCharger samsungCharger;
	
	public Adapter(SamsungCharger samsungCharger) {
		this.samsungCharger = samsungCharger;
	}
	
	@Override
	public void supplyPower() {
		samsungCharger.supplyPower();
	}
	
}
