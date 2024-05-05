package algorithms.part1;

public class InfixToPrefix {
	
	public static void main(String[] args) {
		String infix="a+b-c*(d^e/f)+g";
		String prefix = infixToPrefix(infix);
		System.out.println(prefix);
	}
	
	//Time = O(n)
	public static String infixToPrefix(String infix) {
		
		StringBuilder reversedinfix = new StringBuilder(infix);
		reversedinfix = reversedinfix.reverse();
		
		char[] operatorStack = new char[100];
		StringBuilder result = new StringBuilder();
		int tos  = -1;
		
		for(int i = 0; i < reversedinfix.length(); i++) {
			
			if(isOperand(reversedinfix.charAt(i))) {
				result.append(String.valueOf(reversedinfix.charAt(i)));
			} else {
				if(tos == -1) {
					tos++;
					operatorStack[tos] = reversedinfix.charAt(i);
				} else if(reversedinfix.charAt(i) == '(') {
					while(operatorStack[tos] != ')') {
						result.append(operatorStack[tos]);
						tos--;
					}
					tos--;
				} else {
					while(true) {
						if(precedenceOf(operatorStack[tos]) <= precedenceOf(reversedinfix.charAt(i)) || reversedinfix.charAt(i) == ')') {
							tos++;
							operatorStack[tos] = reversedinfix.charAt(i);
							break;
						} else {
							result.append(operatorStack[tos]);
							tos--;
							if(tos == -1) {
								tos++;
								operatorStack[tos] = reversedinfix.charAt(i);
								break;
							}
						}
					}
				}
			}
		}
		
		while(tos != -1) {
			result.append(operatorStack[tos]);
			tos--;
		}
		
		return result.reverse().toString();
	}
	
	private static int precedenceOf(char ch) {
		switch(ch) {
			case ')':
				return 0;
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
			default:
				return 4;
		}
	}

	private static boolean isOperand(char c) {
		if(c >= 65 && c <=90 || c >= 97 && c <= 122) {
			return true;
		}
		return false;
	}
}
