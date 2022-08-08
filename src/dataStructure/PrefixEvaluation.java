package dataStructure;

import java.util.LinkedList;
import java.util.Scanner;

public class PrefixEvaluation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a prefix expression: ");
		String prefix = in.next();
		Double val = prefixEvalution(prefix);
		System.out.println("Infix: "+val);
	}

	// It will consider integer values from 0 to 9 only
	private static Double prefixEvalution(String prefix) {
		StringBuilder prefixSb = new StringBuilder(prefix);
		StringBuilder reversedPrefix = prefixSb.reverse();
		
		LinkedList<Double> operandStack = new LinkedList<>();
		for(int i = 0; i <= reversedPrefix.length() - 1; i++) {
			if(!isOperator(reversedPrefix.charAt(i))) {
				operandStack.add(Double.valueOf(String.valueOf(reversedPrefix.charAt(i))));
			} else {
				Double op1 = operandStack.removeLast();
				Double op2 = operandStack.removeLast();
				if(reversedPrefix.charAt(i) == '+') {
					operandStack.add(op1 + op2);
				} else if(reversedPrefix.charAt(i) == '-') {
					operandStack.add(op1 - op2);
				} else if(reversedPrefix.charAt(i) == '*') {
					operandStack.add(op1 * op2);
				} else if(reversedPrefix.charAt(i) == '/') {
					operandStack.add(op1 / op2);
				} else if(reversedPrefix.charAt(i) == '^') {
					operandStack.add(Math.pow(op1, op2));
				}
			}
		}
		return operandStack.removeLast();
	}

	private static boolean isOperator(char ch) {
		switch(ch) {
			case '+':
			case '-':
			case '*':
			case '/':
			case '^':
			case '(':
			case ')':
				return true;
			default:
				return false;
		}
	}

}
