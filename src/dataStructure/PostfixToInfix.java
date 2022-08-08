package dataStructure;

import java.util.LinkedList;
import java.util.Scanner;

public class PostfixToInfix {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a postfix expression: ");
		String postfix = in.next();
		String infix = postfixToInfix(postfix);
		System.out.println("Infix: "+infix);
	}

	private static String postfixToInfix(String postfix) {
		LinkedList<String> operandStack = new LinkedList<>();
		for(int i = 0; i <= postfix.length() - 1; i++) {
			if(!isOperator(postfix.charAt(i))) {
				operandStack.add(String.valueOf(postfix.charAt(i)));
			} else {
				String op2 = operandStack.removeLast();
				String op1 = operandStack.removeLast();
				operandStack.add("(" + op1 + postfix.charAt(i) + op2 + ")");
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
