package java_8_features;

import java.util.function.BiFunction;

public class BiFunction_N6 {
	
	public static void main(String[] args) {
		BiFunction<Integer, String, String> bifunction1 = new BiFunction<Integer, String, String>() {
			public String apply(Integer a, String b) {
				return a +"-"+ b;
			}
		};
		
		System.out.println(bifunction1.apply(2, "Two"));
		
		BiFunction<Integer, String, String> bifunction2 = (a, b) -> a +"-"+ b;
		System.out.println(bifunction2.apply(6, "Six"));
	}
	
	
	
}
