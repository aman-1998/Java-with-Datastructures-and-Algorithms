package inheritance;

public class Multiple_Inheritance_using_interface_N4 {
	public static void main(String[] args) {
		HPDevice hpDevice = new HPDevice();
		Printer printer = new HPDevice();
		Scanner scanner = new HPDevice();
		
		hpDevice.scan();
		hpDevice.print();
		hpDevice.changeColor();
		
		System.out.println("-------------------------------");
		
		printer.print();
		printer.changeColor();
		
		System.out.println("-------------------------------");
		
		scanner.scan();
		scanner.changeColor();
	}
}
