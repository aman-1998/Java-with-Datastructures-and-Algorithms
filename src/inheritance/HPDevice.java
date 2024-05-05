package inheritance;

public class HPDevice implements Printer, Scanner { // Multiple inheritance
	
	@Override
	public void print() { // scope should always be greater or equal than parent member
		System.out.println("HPDevice prints");
	}
	
	@Override
	public void scan() {
		System.out.println("HPDevice scans");
	}

	@Override
	public void changeColor() {
		System.out.println("Colored or Black-White");
		
	}
}
