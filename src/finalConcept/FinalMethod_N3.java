package finalConcept;

class Dog {
	public final void sound() {  // final method can't be overriden
		System.out.println("Barking bow bow");
	}
	
	public void friendlyPower() {
		System.out.println("Excellent smelling power");
	}
}

class Pitbul extends Dog{
	public void friendlyPower() {
		System.out.println("Bites people frequently");
	}
	
//	public void sound() {
//		System.out.println("Barking bow bow");
//	}
}

public class FinalMethod_N3 {
	public static void main(String[] args) {
		Dog dog = new Pitbul();
		dog.sound();
		dog.friendlyPower();
	}
}
