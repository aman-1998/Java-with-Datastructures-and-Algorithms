package designPatterns.creational.builder;

public class PhoneBuilder {
	private String os = "Android"; // default value
	private String processor = "Mediatek 180";
	private String ram = "2 GB";
	private String cameraPx = "8 MP";
	private String battery = "3000 mah";
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setCameraPx(String cameraPx) {
		this.cameraPx = cameraPx;
		return this;
	}
	public PhoneBuilder setBattery(String battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone build() {
		
		Phone phone = new Phone();
		phone.setOs(os);
		phone.setBattery(battery);
		phone.setCameraPx(cameraPx);
		phone.setProcessor(processor);
		phone.setRam(ram);
		
		return phone;
	}
}
