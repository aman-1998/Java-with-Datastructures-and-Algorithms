package multithreading;

import java.util.function.Supplier;

/*
 * ThreadLocal variables are maintained per thread separately i.e., if Thread1 changes the value of its ThreadLocal 
 * variable then ThreadLocal variable of Thread2 doesn't have any effect.
 * 
 */

public class ThreadLocal_N26 {
	
	public static void main(String[] args) {
		
		// 1st way:-
		ThreadLocal<Integer> threadLocal1 = new ThreadLocal<>();
		threadLocal1.set(200);
		
		System.out.println(threadLocal1.get());
		System.out.println("---------------------------------------------------------------------------------");
		
		// 2nd way:-
		ThreadLocal<Integer> threadLocal2 = ThreadLocal.withInitial(new Supplier<Integer>() {

			@Override
			public Integer get() {
				return 400;
			}
			
		});
		
		System.out.println(threadLocal2.get());
		System.out.println("---------------------------------------------------------------------------------");
		
		// 3rd way:-
		ThreadLocal<Integer> threadLocal3 = ThreadLocal.withInitial(() -> 500);
		System.out.println(threadLocal3.get());
		System.out.println("---------------------------------------------------------------------------------");
		
		// 4th way:-
		ThreadLocal<Integer> threadLocal4 = new ThreadLocal<Integer> () {
			
			@Override
			protected Integer initialValue() {
				return 700;
			}
		};
		
		System.out.println(threadLocal4.get());
		System.out.println("---------------------------------------------------------------------------------");
	}
}
