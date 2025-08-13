package practice.dsa.sheet.part1;

import java.util.Stack;

public class PrefixEvaluation {
	
	public static void main(String[] args) {
		String prefix="++2*3-5^42/23";
		double value = prefixEvaluation(prefix);
		System.out.println(value);
	}
	
	// Time = O(n)
	public static double prefixEvaluation(String prefix) {
		
		StringBuilder reversedPrefix = new StringBuilder(prefix);
		reversedPrefix = reversedPrefix.reverse();
		
		Stack<Double> operandStack = new Stack<>();
		double result = 0;
		double op1, op2;
		
		for(int i = 0; i < reversedPrefix.length(); i++) {
			if(isOperand(reversedPrefix.charAt(i))) {
				operandStack.push(Double.valueOf(String.valueOf(reversedPrefix.charAt(i))));
			} else {
				op1 = operandStack.pop();
				op2 = operandStack.pop();
				result = operation(op1, reversedPrefix.charAt(i), op2);
				operandStack.push(result);
			}
		}
		return operandStack.pop();
	}

	private static double operation(double op1, char operator, double op2) {
		
		switch(operator) {
			case '+':
				return op1 + op2;
			case '-':
				return op1 - op2;
			case '*':
				return op1 * op2;
			case '/':
				return op1 / op2;
			default:
				return Math.pow(op1,op2);
		}

	}

	private static boolean isOperand(char ch) {
		if(ch >= 48 && ch <=57) {
			return true;
		}
		return false;
	}
}
