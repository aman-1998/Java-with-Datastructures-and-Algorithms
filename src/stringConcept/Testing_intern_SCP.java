package stringConcept;

public class Testing_intern_SCP {
	
	public static void main(String[] args) {
		
		String s1 = "HelloWorld"; // "HelloWorld" is created is SCP
		String s2 = "HelloWorld"; // Reference of already created "HelloWorld" in SCP is returned
		String s3 = s1.intern(); // Reference of already created "HelloWorld" in SCP is returned
		String s4 = s2.intern(); // Reference of already created "HelloWorld" in SCP is returned
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1.equals(s2));
		
		System.out.println("---------------------------------");
		
		String s5 = "Good"; // "Good" is created in SCP
		s5 = s5 + "Boy"; // "Boy" is created in SCP. "GoodBoy" is created in HeapMemory outside SCP and s5 will point to that "GoodBoy".
		String s6 = "GoodBoy"; // "GoodBoy" is created in SCP
		String s7 = s5.intern(); // Reference of already created "GoodBoy" in SCP is returned
		String s8 = s6.intern(); // Reference of already created "GoodBoy" in SCP is returned
		System.out.println(s5 == s6);
		System.out.println(s7 == s8);
		System.out.println(s5.equals(s6));
		
		System.out.println("---------------------------------");
		
		String s9 = "Strong"; // "Strong" is created in SCP
		s9 = s9 + "Teeth"; // "Teeth" is created in SCP. "StrongTeeth" is created in HeapMemory outside SCP and s9 will point to that "StrongTeeth".
		String s10 = "Strong"; // Reference of already created "Strong" in SCP is returned
		s10 = s10 + ""; // "Strong" is created in HeapMemory outside SCP and s10 will point to that "Strong".
		s10 = s10 + "Teeth"; // Reference of already created "Teeth" in SCP is returned. And "StrongTeeth" is created in HeapMemory outside SCP and s10 will point to that "StrongTeeth".
		String s11 = s9.intern(); // "StrongTeeth" is created in SCP and and its reference is returned
		String s12 = s10.intern(); // Reference of already created "StrongTeeth" in SCP is returned
		System.out.println(s9 == s10);
		System.out.println(s11 == s12);
		System.out.println(s11.equals(s12));
		
	}
}
