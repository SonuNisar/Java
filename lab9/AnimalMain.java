package lab9;
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}
public class AnimalMain {

	
	public static void main(String[] args) {
		
		        Animal animal = new Animal();
		        Animal dog = new Dog();
		        Animal cat = new Cat();

		        animal.makeSound();
		        dog.makeSound();
		        cat.makeSound();
	}

}
