package collection_framework_basics;

import java.util.Stack;

public class Stack_N5 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(42);
		stack.add(34);
		stack.add(92);
		stack.add(42);
		stack.add(79);
		stack.add(13);
		
		Display_List<Integer> disp = new Display_List<Integer>();
		System.out.println("Stack:-");
		disp.display2(stack);
		System.out.println("\n----------------------------------------");
		
		System.out.print(stack.pop()); // pop()
		System.out.println("\n----------------------------------------");
		
		System.out.println("Stack:-");
		disp.display2(stack);
		System.out.println("\n----------------------------------------");
		
		stack.push(48); // push(41)
		System.out.println("Stack:-");
		disp.display2(stack);
		System.out.println("\n----------------------------------------");
		
		System.out.println(stack.peek()); // peek()
		System.out.println("\n----------------------------------------");
		
		System.out.println(stack.isEmpty()); // isEmpty()
		System.out.println("\n----------------------------------------");
		
		System.out.println(stack.size()); // size()
		System.out.println("\n----------------------------------------");
		
		System.out.println(stack.contains(14)); // contains()
		System.out.println("\n----------------------------------------");
		
		Stack<Integer> stack1 = new Stack<Integer>();
		System.out.println(stack.equals(stack1)); // equals()
		System.out.println("\n----------------------------------------");
		
		stack.clear(); // clear()
		System.out.println("Stack:-");
		disp.display2(stack);
		System.out.println("\n----------------------------------------");
	}
}
