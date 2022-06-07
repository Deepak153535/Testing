package Method;

public class Animal {

	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.eat();
		a.run();
		a.bark();
	}
	public static void eat()
	{
		System.out.println("Animal is eating");
	}
	public static void bark()
	{
		System.out.println("Dog is bark");
	}
	public static void run()
	{
		System.out.println("Dog is running");
	}
}
