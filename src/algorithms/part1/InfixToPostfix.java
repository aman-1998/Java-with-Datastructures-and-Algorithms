package algorithms.part1;

public class InfixToPostfix {
	
	public static void main(String[] args) {
		String infix="a+b-c*(d^e/f)+g";
		String postfix = infixToPostfix(infix);
		System.out.println(postfix);
	}
	
	//Time = O(n)
	public static String infixToPostfix(String infix) {
		
		char[] operatorStack = new char[100];
		StringBuilder result = new StringBuilder();
		int tos  = -1;
		
		for(int i = 0; i < infix.length(); i++) {
			
			if(isOperand(infix.charAt(i))) {
				result.append(String.valueOf(infix.charAt(i)));
			} else {
				if(tos == -1) {
					tos++;
					operatorStack[tos] = infix.charAt(i);
				} else if(infix.charAt(i) == ')') {
					while(operatorStack[tos] != '(') {
						result.append(operatorStack[tos]);
						tos--;
					}
					tos--;
				} else {
					while(true) {
						if(precedenceOf(operatorStack[tos]) < precedenceOf(infix.charAt(i)) || infix.charAt(i) == '(') {
							tos++;
							operatorStack[tos] = infix.charAt(i);
							break;
						} else {
							result.append(operatorStack[tos]);
							tos--;
							if(tos == -1) {
								tos++;
								operatorStack[tos] = infix.charAt(i);
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
		
		return result.toString();
	}
	
	private static int precedenceOf(char ch) {
		switch(ch) {
			case '(':
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
