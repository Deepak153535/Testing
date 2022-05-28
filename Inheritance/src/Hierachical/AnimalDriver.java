package Hierachical;

public class AnimalDriver {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.bark();
		d.eat();
		// d.meow();

		Cat c = new Cat();
		c.eat();
		c.meow();
		// c.bark();

	}
}
