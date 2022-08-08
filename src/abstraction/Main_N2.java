package abstraction;

abstract class Animal {
	public abstract void makeSound();
	
	public void death() {
		System.out.println("Death is the ultimate reality");
	}
	
	public void reproduction() {
		System.out.println("Animals reproduce");
	}
	
	public void eat() {
		System.out.println("Animals eat");
	}
}

abstract class Mammal extends Animal {
	
	public void hair() {
		System.out.println("Mammals have hair on their body");
	}
}

class Dog extends Mammal {
	
	public void makeSound() {
		System.out.println("Dogs bark bow bow");
	}
	
	public void tail() {
		System.out.println("Dogs have a curvy tail");
	}
}

public class Main_N2 {
	public static void main(String[] args) {
		Mammal mammal = new Dog();
		mammal.makeSound();
		mammal.death();
		mammal.reproduction();
		mammal.eat();
		mammal.hair();
		
		System.out.println("-----------------------------");
		
		Animal animal = new Dog();
		animal.makeSound();
		animal.death();
		animal.reproduction();
		animal.eat();
		
		System.out.println("------------------------------");
		
		Dog dog = new Dog();
		dog.makeSound();
		dog.death();
		dog.reproduction();
		dog.eat();
		dog.hair();
		dog.tail();
	}
}
