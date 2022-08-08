package designPatterns.structural.composite;

public class Peripheral implements Component{
	private String monitor;
	private String keyboard;
	private String mouse;
	private String speaker;
	
	public Peripheral(String monitor, String keyboard, String mouse, String speaker) {
		this.monitor = monitor;
		this.keyboard = keyboard;
		this.mouse = mouse;
		this.speaker = speaker;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	public String getSpeaker() {
		return speaker;
	}

	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	@Override
	public String toString() {
		return "Peripheral [monitor=" + monitor + ", keyboard=" + keyboard + ", mouse=" + mouse + ", speaker=" + speaker
				+ "]";
	}

	public int calculatePrice() {
		int costOfMonitor = 6000;
		int costOfKeyBoard = 3000;
		int costOfMouse = 2000;
		int costOfSpeaker = 1000;
		return costOfMonitor + costOfKeyBoard + costOfMouse + costOfSpeaker;
	}
	
}
