package Methid;

public class Car {

	String name;
	int price;
	
	public Car(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	public void display()
	{
		System.out.println("Car name is : "+name);
		System.out.println("Car price is : "+price);
	}
}
