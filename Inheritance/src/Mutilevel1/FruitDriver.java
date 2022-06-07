package Mutilevel1;

public class FruitDriver {

	public static void main(String[] args) {
		
		Fruit f=new Fruit();
		System.out.println(f.color);
		f.fruit();
		
		Mango m=new Mango();
		m.mango();
		m.fruit();
		System.out.println(m.color);

		Banana b=new Banana();
		System.out.println(b.color);
		b.fruit();
		b.mango();
		b.mango();
	}
}
