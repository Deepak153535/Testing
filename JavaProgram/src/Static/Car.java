package Static;

public class Car {

	String name;
	int price;
	static int cylender=4;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	Car(String name,int price)
	{
		this.name=name;
		this.price=price;
		
	}
	public static void change()
	{
		cylender=12;
	}
	public void display()
	{
		System.out.println("Car name is : "+name);
		System.out.println("Car price is : "+price);
		System.out.println("Car cylender is : "+cylender);
		System.out.println("==========================");
	}
}
