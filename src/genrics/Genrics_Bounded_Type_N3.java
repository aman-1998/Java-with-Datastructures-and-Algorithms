package genrics;

public class Genrics_Bounded_Type_N3 {
	public static void main(String[] args) {
		Operation<Integer, Integer> op1 = new Operation<>();
		op1.sum(3, 4);
		
		Operation<Integer, String> op2 = new Operation<>();
		op2.concat(5, "Aman");
	}
}

class Operation<T extends Number, U> {

	public <U extends Number> void sum(T num1, U num2) {
		Integer num3 = Integer.valueOf(num1.toString());
		Integer num4 = Integer.valueOf(num2.toString());
		Integer sum = num3 + num4;
		System.out.println("Sum = "+sum);
	}
	
	public void concat(T num, U str) {
		String concatinatedStr = num.toString() + str.toString();
		System.out.println("Concatinated string = "+concatinatedStr);
	}
	
}
