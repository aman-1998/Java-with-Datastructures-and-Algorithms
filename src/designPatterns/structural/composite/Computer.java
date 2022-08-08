package designPatterns.structural.composite;

public class Computer implements Component{
	private Cabinet cabinate;
	private Peripheral peripheralDevices;
	
	public Computer(Cabinet cabinate, Peripheral peripheralDevices) {
		this.cabinate = cabinate;
		this.peripheralDevices = peripheralDevices;
	}

	public Cabinet getCabinate() {
		return cabinate;
	}

	public void setCabinate(Cabinet cabinate) {
		this.cabinate = cabinate;
	}

	public Peripheral getPeripheralDevices() {
		return peripheralDevices;
	}

	public void setPeripheralDevices(Peripheral peripheralDevices) {
		this.peripheralDevices = peripheralDevices;
	}

	@Override
	public String toString() {
		return "Computer [cabinate=" + cabinate + ", peripheralDevices=" + peripheralDevices + "]";
	}

	@Override
	public int calculatePrice() {
		return this.cabinate.calculatePrice() + this.peripheralDevices.calculatePrice();
	}

	
	
}
