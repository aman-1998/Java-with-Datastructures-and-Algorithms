package inheritance;

public class HPDevice implements Printer, Scanner { // Multiple inheritance
	
	public void print() { // scope should always be greater or equal than parent member
		System.out.println("HPDevice prints");
	}
	
	public void scan() {
		System.out.println("HPDevice scans");
	}
}
