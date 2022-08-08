package finalConcept;

final class A { // final class can't be inherited
	public void property1() {
		System.out.println("Property-1");
	}
	
	public void property2() {
		System.out.println("Property-2");
	}
}

//class B extends A {
//	
//}

public class FinalClass_N2 {
	public static void main(String[] args) {
		A a = new A();
		a.property1();
		a.property2();
	}
}
