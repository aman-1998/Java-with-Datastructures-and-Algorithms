package dataStructure;

import java.util.LinkedList;
import java.util.Scanner;

public class PostfixEvaluation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a postfix expression: ");
		String postfix = in.next();
		Double val = postfixEvalution(postfix);
		System.out.println("Infix: "+val);
	}

	// It will consider integer values from 0 to 9 only
	private static Double postfixEvalution(String postfix) {
		LinkedList<Double> operandStack = new LinkedList<>();
		for(int i = 0; i <= postfix.length() - 1; i++) {
			if(!isOperator(postfix.charAt(i))) {
				operandStack.add(Double.valueOf(String.valueOf(postfix.charAt(i))));
			} else {
				Double op2 = operandStack.removeLast();
				Double op1 = operandStack.removeLast();
				if(postfix.charAt(i) == '+') {
					operandStack.add(op1 + op2);
				} else if(postfix.charAt(i) == '-') {
					operandStack.add(op1 - op2);
				} else if(postfix.charAt(i) == '*') {
					operandStack.add(op1 * op2);
				} else if(postfix.charAt(i) == '/') {
					operandStack.add(op1 / op2);
				} else if(postfix.charAt(i) == '^') {
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
