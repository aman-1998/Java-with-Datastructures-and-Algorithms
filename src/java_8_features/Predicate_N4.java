package java_8_features;

import java.util.function.Predicate;

public class Predicate_N4 {
	public static void main(String[] args) {
		Predicate<String> predicate1 = new Predicate<String>() {
			@Override
			public boolean test(String str) {
				return str.startsWith("S");
			}
		};
		System.out.println(predicate1.test("Surabhi"));
		System.out.println(predicate1.test("Aman"));
		
		Predicate<Integer> predicate2 = t -> t%2 == 0;
		System.out.println(predicate2.test(46));
		System.out.println(predicate2.test(45));
	}
}
