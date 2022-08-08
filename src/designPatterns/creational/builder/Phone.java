package designPatterns.creational.builder;

public class Phone {
	private String os;
	private String processor;
	private String ram;
	private String cameraPx;
	private String battery;
	
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

	public String getProcessor() {
		return processor;
	}

	public String getRam() {
		return ram;
	}

	public String getCameraPx() {
		return cameraPx;
	}

	public String getBattery() {
		return battery;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", ram=" + ram + ", cameraPx=" + cameraPx + ", battery="
				+ battery + "]";
	}
	
}
