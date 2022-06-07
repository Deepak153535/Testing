package Java;

public class Car {

	String name;
	int price;
	String color;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	Car(String name,int price,String color)
	{
		this.name=name;
		this.price=price;
		this.color=color;
	}
	public void display()
	{
		System.out.println("Car Name is : "+name);
		System.out.println("Car price is : "+price);
		System.out.println("Car color is color : "+color);
		System.out.println("-=========================");
	}
	public void finalize()
	{
		System.out.println("Clear the databse");
		System.out.println("disconnect...");
	}
	
	
}
