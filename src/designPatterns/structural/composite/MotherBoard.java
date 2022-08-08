package designPatterns.structural.composite;

public class MotherBoard implements Component {
	private String cpu;
	private String ram;
	
	public MotherBoard(String cpu, String ram) {
		this.cpu = cpu;
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "MotherBoard [cpu=" + cpu + ", ram=" + ram + "]";
	}

	@Override
	public int calculatePrice() {
		int costOfCPU = 15000;
		int costOfRam = 8000;
		return costOfCPU + costOfRam;
	}
	
}
