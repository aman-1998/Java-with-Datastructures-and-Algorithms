package algorithms.part1;

import java.util.Stack;

public class PostfixEvaluation {
	
	public static void main(String[] args) {
		String postfix="52*6522^-*5/+";
		double value = posfixEvaluation(postfix);
		System.out.println(value);
	}
	
	// Time = O(n)
	public static double posfixEvaluation(String postfix) {
		Stack<Double> operandStack = new Stack<>();
		double result = 0;
		double op1, op2;
		
		for(int i = 0; i < postfix.length(); i++) {
			if(isOperand(postfix.charAt(i))) {
				operandStack.push(Double.valueOf(String.valueOf(postfix.charAt(i))));
			} else {
				op2 = operandStack.pop();
				op1 = operandStack.pop();
				result = operation(op1, postfix.charAt(i), op2);
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
