package ObjectAndClass;

public class Fruit {

	String name;
	int price;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	Fruit(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	
	public Fruit display()
	{
		System.out.println("Fruit name is : "+name);
		System.out.println("Fruit price is : "+price);
		System.out.println("=====================");
		return this;
	}
}
