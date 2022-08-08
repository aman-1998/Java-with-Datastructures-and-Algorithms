package innerClass;

public class Inner_regular_N1 {
	
	public static void main(String[] args) {
		Outer1 out1 = new Outer1("Mishra Khandan");
		Outer1.Inner inn = out1.new Inner(43);
		inn.ot.test();
		inn.test();
	}
}

class Outer1 {
	int var1 = 45;
	String str = "Aman";
	
	public Outer1(String str) {
		this.str = str;
	}
	
	public void test() {
		System.out.println(str);
	}
	
	class Inner {
		int var = 25;
		Outer1 ot = Outer1.this;
		
		public Inner(int var) {
			this.var = var;
		}
		
		public void test() {
			System.out.println(var);
			System.out.println(str);
		}
	}
}
