package java_8_features;

import java.util.function.Supplier;

public class Supplier_N3 {
	public static void main(String[] args) {
		Supplier<String> supplier1 = new Supplier<String>() {
			@Override
			public String get() {
				return "My name is Aman";
			}
		};
		System.out.println(supplier1.get());
		
		Supplier<Integer> supplier2 = () -> 137;
		System.out.println(supplier2.get());
	}
}
