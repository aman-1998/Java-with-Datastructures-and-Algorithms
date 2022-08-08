package polymophism;

public class Overriding_N1 
{
	public static void main(String[] args)
	{
		/*
		 * Conditions for method overriding:-
		 * ----------------------------------------
		 * 1. Argument list should be exactly same
		 * 2. Scope of access modifier of the method in child class should be
		 * 	  greater than or equal to the scope of access modifier of the method
		 * 	  in parent class.
		 * 3.private, static , final method can't be overriden
		 */
		
		Parent ob = new Child();
		ob.sum(6, 7); // which sum to be called is decided dynamically
		ob.mul(8, 9);
	}
}
