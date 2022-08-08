package inheritance;

public class Multilevel_Inheritance_using_interface_N4 {
	public static void main(String[] args) {
		HPDevice hpDevice = new HPDevice();
		Printer printer = new HPDevice();
		Scanner scanner = new HPDevice();
		
		hpDevice.scan();
		hpDevice.print();
		
		System.out.println("-------------------------------");
		
		printer.print();
		
		System.out.println("-------------------------------");
		
		scanner.scan();
	}
}
