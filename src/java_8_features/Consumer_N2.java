package java_8_features;

import java.util.function.Consumer;

public class Consumer_N2 {
	
	public static void main(String[] args) {
		Consumer<Integer> consumer1 = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("Value = "+t);
			}
		};
		consumer1.accept(37);
		
		Consumer<String> consumer2 = t -> System.out.println("Hello! "+t);
		consumer2.accept("Aman");
	}
	
}
