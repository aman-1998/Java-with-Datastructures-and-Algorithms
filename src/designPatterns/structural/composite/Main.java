package designPatterns.structural.composite;

public class Main {
	public static void main(String[] args) {
		MotherBoard motherBoard = new MotherBoard("Intel Core i7", "16 GB");
		Cabinet cabinet = new Cabinet("1 TB", motherBoard);
		Peripheral peripheralDevice = new Peripheral("15 inch", "Keyboard", "Touch-pad", "Dollby speaker");
		Computer computer = new Computer(cabinet, peripheralDevice);
		
		int priceOfComputer = computer.calculatePrice();
		System.out.println(priceOfComputer);
		
		int priceOfCabinet = cabinet.calculatePrice();
		System.out.println(priceOfCabinet);
		
		int priceOfMotherBoard = motherBoard.calculatePrice();
		System.out.println(priceOfMotherBoard);
		
		int priceOfPeripheralDevices = peripheralDevice.calculatePrice();
		System.out.println(priceOfPeripheralDevices);
	}
	
}
