package Constructor;

public class Car {

	//Copy Contructor
	
	String name;
	int price;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	Car(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	Car(Car c)
	{
		name=c.name;
		price=c.price;
	}
	public void display()
	{
		System.out.println("Car name is : "+name);
		System.out.println("Car price is : "+price);
	}
	
}
