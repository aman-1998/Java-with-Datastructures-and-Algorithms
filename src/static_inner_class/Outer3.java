package static_inner_class;

public class Outer3 {
	
	private int x = 67;
	private static int z = 35;
	
	public Outer3(int x) {
		this.x = x;
	}
	
	public void test5() {
		System.out.println("Aman");
	}
	
	public static void test6() {
		System.out.println(z);
	}
	
	public static class Nested {
		
		private int y = 92;

		public Nested(int y) {
			this.y = y;
		}
		
		public void test1() {
			System.out.println(y);
			//System.out.println(x); non-static members are not accessible
			test6();
			// test5(); non-static members are not accessible
		}
	}
}
