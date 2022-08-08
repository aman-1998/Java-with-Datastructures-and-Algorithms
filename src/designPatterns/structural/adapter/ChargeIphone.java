package designPatterns.structural.adapter;

public class ChargeIphone {
	private IphoneCharger iphoneCharger;

	public IphoneCharger getIphoneCharger() {
		return iphoneCharger;
	}

	public void setIphoneCharger(IphoneCharger iphoneCharger) {
		this.iphoneCharger = iphoneCharger;
	}
	
	public void charge() {
		iphoneCharger.supplyPower();
	}
}
