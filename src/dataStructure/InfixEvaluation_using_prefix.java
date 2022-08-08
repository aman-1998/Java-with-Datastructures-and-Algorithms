package dataStructure;

import java.util.LinkedList;
import java.util.Scanner;

public class InfixEvaluation_using_prefix {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter infix expression: "); // ((2+(3*(5-(4^2))))+(2/3))
		String infix = in.next();
		String prefix = infixToPrefix(infix);
		System.out.println("Prefix: "+prefix);
		Double val = prefixEvalution(prefix);
		System.out.println("Value = "+val);
	}
	
	private static String infixToPrefix(String infix) {
		StringBuilder infixSb = new StringBuilder(infix);
		// reverse infix expression
		StringBuilder reversedInfixSb = infixSb.reverse();
		StringBuilder reversedPrefix = new StringBuilder();
		LinkedList<Character> operatorStack = new LinkedList<>();
		for(int i = 0; i <= reversedInfixSb.length() - 1; i++) {
			if(!isOperator(reversedInfixSb.charAt(i))) { // if element is not an operator
				reversedPrefix.append(reversedInfixSb.charAt(i));
			} else if(reversedInfixSb.charAt(i) != '(') { // if element is an operator other than '('
				while(!isPushable(operatorStack, reversedInfixSb.charAt(i))) {
					reversedPrefix.append(operatorStack.removeLast());
				}
				operatorStack.add(reversedInfixSb.charAt(i));
			} else { // if element is and operator ')'
				while(operatorStack.peekLast() != ')') {
					reversedPrefix.append(operatorStack.removeLast());
				}
				operatorStack.removeLast();
			}
		}
		
		//Empty the operator stack and append the elements to postfix
		while(!operatorStack.isEmpty()) {
			reversedPrefix.append(operatorStack.removeLast());
		}
		String prefix = reversedPrefix.reverse().toString(); // reverse to get actual prefix
		return prefix;
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
	
	private static boolean isPushable(LinkedList<Character> operatorStack, char ch) {
		if(operatorStack.isEmpty()) {
			return true;
		} else if(operatorStack.peekLast() == ')') {
			return true;
		} else if(precedence(ch) >= precedence(operatorStack.peekLast())) {
			return true;
		} else {
			return false;
		}
	}

	private static int precedence(char ch) {
		switch(ch) {
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 3;
			case '^':
				return 5;
			case '(':
				return 6;
			default:
				return 7;
		}
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
