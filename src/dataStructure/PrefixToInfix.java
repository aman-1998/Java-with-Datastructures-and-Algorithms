package dataStructure;

import java.util.LinkedList;
import java.util.Scanner;

public class PrefixToInfix {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a prefix expression: ");
		String prefix = in.next();
		String infix = prefixToInfix(prefix);
		System.out.println("Infix: "+infix);
	}

	private static String prefixToInfix(String prefix) {
		StringBuilder prefixSb = new StringBuilder(prefix);
		StringBuilder reversedPrefix = prefixSb.reverse();
		LinkedList<String> operandStack = new LinkedList<>();
		for(int i = 0; i <= reversedPrefix.length() - 1; i++) {
			if(!isOperator(reversedPrefix.charAt(i))) {
				operandStack.add(String.valueOf(reversedPrefix.charAt(i)));
			} else {
				String op1 = operandStack.removeLast();
				String op2 = operandStack.removeLast();
				operandStack.add("(" + op1 + reversedPrefix.charAt(i) + op2 + ")");
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