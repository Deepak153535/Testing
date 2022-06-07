package Basic;

public class Cat extends Animal {

	void eat() {
		System.out.println("Eatint bread...");
	}

	void bark() {
		System.out.println("Bark");
	}

	void work() {
		super.eat();
		bark();

	}

}
