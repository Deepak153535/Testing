package Constructor;

public class Fruit {

	//Copy without Contructor
	
	String name;
	int price;
	
	Fruit(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	public void display()
	{
		System.out.println("Fruit name is : "+name);
		System.out.println("Fruit price is : "+price);
	}
	
}
