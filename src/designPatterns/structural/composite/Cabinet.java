package designPatterns.structural.composite;

public class Cabinet implements Component{
	private String hardDrive;
	private MotherBoard mb;
	
	public Cabinet(String hardDrive, MotherBoard mb) {
		this.hardDrive = hardDrive;
		this.mb = mb;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}

	public MotherBoard getMb() {
		return mb;
	}

	public void setMb(MotherBoard mb) {
		this.mb = mb;
	}

	@Override
	public String toString() {
		return "Cabinet [hardDrive=" + hardDrive + ", mb=" + mb + "]";
	}

	public int calculatePrice() {
		int costOfHardDrive = 4000;
		return costOfHardDrive + this.mb.calculatePrice();
	}
	
}
