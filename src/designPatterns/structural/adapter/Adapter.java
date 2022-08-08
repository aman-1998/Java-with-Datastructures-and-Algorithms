package designPatterns.structural.adapter;

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
