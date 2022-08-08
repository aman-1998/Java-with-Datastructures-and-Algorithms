package dataStructure;

import java.util.LinkedList;
import java.util.Scanner;

public class Infix_to_postfix {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter infix expression: ");
		String infix = in.next();
		String postfix = infixToPostFix(infix);
		System.out.println("Postfix: "+postfix);
	}

	private static String infixToPostFix(String infix) {
		StringBuilder postfix = new StringBuilder();
		LinkedList<Character> operatorStack = new LinkedList<>();
		for(int i = 0; i <= infix.length() - 1; i++) {
			if(!isOperator(infix.charAt(i))) { // if element is not an operator
				postfix.append(infix.charAt(i));
			} else if(infix.charAt(i) != ')') { // if element is an operator other than ')'
				while(!isPushable(operatorStack, infix.charAt(i))) {
					postfix.append(operatorStack.removeLast());
				}
				operatorStack.add(infix.charAt(i));
			} else { // if element is and operator '('
				while(operatorStack.peekLast() != '(') {
					postfix.append(operatorStack.removeLast());
				}
				operatorStack.removeLast();
			}
		}
		
		//Empty the operator stack and append the elements to postfix
		while(!operatorStack.isEmpty()) {
			postfix.append(operatorStack.removeLast());
		}
		return postfix.toString();
	}

	private static boolean isPushable(LinkedList<Character> operatorStack, char ch) {
		if(operatorStack.isEmpty()) {
			return true;
		} else if(operatorStack.peekLast() == '(') {
			return true;
		} else if(precedence(ch) > precedence(operatorStack.peekLast())) {
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
