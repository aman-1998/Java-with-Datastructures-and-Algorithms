package innerClass;

public class Inner_method_local_N2 {
	
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.test();
		//Object ob = out.test();
		
	}
}

class Outer2 {
	
	public Object test() {
		int var1 = 23; // default or final
		
		class Inner { // default abstract or final
			
			private String name = "Aman";
			Outer2 ot = Outer2.this;
			
			public Inner(String name) {
				this.name = name;
			}
			
			public void message() {
				System.out.println(name);
			}
		}
		
		Inner inn = new Inner("Mishra");
		System.out.println(inn.name);
		inn.message();
		inn.ot.test2();
		
		return inn;
	}
	
	public void test2() {
		System.out.println("Bye");
	}
	
}
