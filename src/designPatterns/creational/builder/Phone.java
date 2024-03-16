package designPatterns.creational.builder;

public class Phone {
	private String os;
	private String processor;
	private String ram;
	private String cameraPx;
	private String battery;
	
	public Phone() {}
	
	public Phone(String os, String processor, String ram, String cameraPx, String battery) {
		this.os = os;
		this.processor = processor;
		this.ram = ram;
		this.cameraPx = cameraPx;
		this.battery = battery;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCameraPx() {
		return cameraPx;
	}

	public void setCameraPx(String cameraPx) {
		this.cameraPx = cameraPx;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", ram=" + ram + ", cameraPx=" + cameraPx + ", battery="
				+ battery + "]";
	}
	
}
