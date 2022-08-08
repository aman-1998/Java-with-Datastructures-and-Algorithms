package java_8_features;

/*
 * A interface is called Functional-Interface if it has only one 
 * public abstract method. It may or may not have multiple default and 
 * static methods.
 */
@FunctionalInterface
interface Test {
	void test(); //By default it is: public abstract
}

@FunctionalInterface
interface Test1 {
	void check1();
}

@FunctionalInterface
interface Test2 {
	void check2(int a, int b);
}

@FunctionalInterface
interface Test3 {
	String check3();
}

@FunctionalInterface
interface Test4 {
	String check4(int a);
}

//@FunctionalInterface is not mandatory but good to have
interface Test5 {
	int check5(int t);
}

@FunctionalInterface
interface Test6 {
	String check6(int t, int u);
}

public class Lambda_Expression_N1 {
	public static void main(String[] args) {
		
		Test test = new Test( ) {
			@Override
			public void test() {
				System.out.println("Aman");
			}
		};
		test.test();
		
		//------------------------------------------------
		
		Test1 test1 = () -> {
			System.out.println("Alka Prasad");
		};
		test1.check1();
		
		//-------------------------------------------------
		
		Test2 test2 = (int a, int b) -> System.out.println("Sum = "+(a + b));
		test2.check2(4, 3);
		
		//-------------------------------------------------
		
		Test3 test3 = () -> {
			return "Amrita Rao";
		};
		System.out.println(test3.check3());
		
		//-------------------------------------------------
		
		Test4 test4 = (a) -> "Value = "+a;
		System.out.println(test4.check4(45));
		
		//-------------------------------------------------
		
		Test5 test5 = t -> t + 2;
		System.out.println(test5.check5(8));
		
		//---------------------------------------------------
		
		Test6 test6 = (t, u) -> String.valueOf(t + u);
		System.out.println(test6.check6(7, 2));
	}
}
