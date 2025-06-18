package innerClass;

public class Inner_Annonymous_N3 {
	public static void main(String[] args) {
		Test1 ob1 = new Test1() {
			
			@Override
			public void fun1() {
				System.out.println("Bye");
			}
			
			public void fun3() {
				System.out.println("Tata");
			}
		};
		
		Test2 ob2 = new Test2() {
			
			@Override
			public void fun1() {
				System.out.println("Namaste");
			}
			
			@Override
			public void fun2() {
				System.out.println("Pranam");
			}
		};
		
		ob1.fun1();
		ob1.fun2();
		ob2.fun1();
		ob2.fun2();
	}

}

class Test1 {
	public void fun1() {
		System.out.println("Hello");
	}
	
	public void fun2() {
		System.out.println("World");
	}
}

interface Test2 {
	public void fun1();
	public void fun2();
}
