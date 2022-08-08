package java_8_features;

import java.util.function.Function;

public class Function_N5 {
	public static void main(String[] args) {
		Function<Integer, Boolean> function1 = new Function<Integer, Boolean>() {
			@Override
			public Boolean apply(Integer n) {
				return (n & (n-1)) == 0 ? true : false;
			}
		};
		
		System.out.println(function1.apply(16));
		System.out.println(function1.apply(32));
		System.out.println(function1.apply(64));
		
		Function<String, Boolean> function2 = t -> t.startsWith("A");
		System.out.println(function2.apply("Shatabdi"));
		System.out.println(function2.apply("Anurag"));
	}
}
